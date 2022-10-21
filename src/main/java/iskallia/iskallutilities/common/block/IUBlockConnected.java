package iskallia.iskallutilities.common.block;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class IUBlockConnected extends DirectionalBlock
{
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final EnumProperty<StairsShape> SHAPE = BlockStateProperties.STAIRS_SHAPE;
	private final Block modelBlock;
	private final BlockState modelState;
	
	public IUBlockConnected(AbstractBlock.Properties properties)
	{
		super(properties);
		this.modelBlock = Blocks.AIR; // These are unused, fields are redirected
	    this.modelState = Blocks.AIR.getDefaultState();
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		builder.add(FACING,SHAPE);
	}
	
	@Nullable
	@Override
	public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state) {
		this.modelBlock.onPlayerDestroy(worldIn, pos, state);
	}

	@SuppressWarnings("deprecation")
	@Nullable
	@Override
	public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
		if (!state.isIn(state.getBlock())) {
			this.modelState.neighborChanged(worldIn, pos, Blocks.AIR, pos, false);
			this.modelBlock.onBlockAdded(this.modelState, worldIn, pos, oldState, false);
		}
	}
	
	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		BlockPos blockpos = context.getPos();
		BlockState blockstate = this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing());
		return blockstate.with(SHAPE, getShapeProperty(blockstate, context.getWorld(), blockpos));
	}

	@SuppressWarnings("deprecation")
	@Nullable
	@Override
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		return facing.getAxis().isHorizontal() ? stateIn.with(SHAPE, getShapeProperty(stateIn, worldIn, currentPos)) : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	}
	
	private static StairsShape getShapeProperty(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Direction direction = state.get(FACING);
		BlockState blockstate = worldIn.getBlockState(pos.offset(direction));
		if (isIUBlockConnected(blockstate)) {
			Direction direction1 = blockstate.get(FACING);
			if (direction1.getAxis() != state.get(FACING).getAxis() && isDifferentIUBlockConnected(state, worldIn, pos, direction1.getOpposite())) {
				if (direction1 == direction.rotateYCCW()) {
					return StairsShape.OUTER_LEFT;
				}
				return StairsShape.OUTER_RIGHT;
			}
		}

		BlockState blockstate1 = worldIn.getBlockState(pos.offset(direction.getOpposite()));
		if (isIUBlockConnected(blockstate1)) {
			Direction direction2 = blockstate1.get(FACING);
			if (direction2.getAxis() != state.get(FACING).getAxis() && isDifferentIUBlockConnected(state, worldIn, pos, direction2)) {
				if (direction2 == direction.rotateYCCW()) {
					return StairsShape.INNER_LEFT;
				}
				return StairsShape.INNER_RIGHT;
			}
		}

		return StairsShape.STRAIGHT;
	}
	
	private static boolean isDifferentIUBlockConnected(BlockState state, IBlockReader worldIn, BlockPos pos, Direction face) {
		BlockState blockstate = worldIn.getBlockState(pos.offset(face));
		return !isIUBlockConnected(blockstate) || blockstate.get(FACING) != state.get(FACING);
	}

	private static boolean isIUBlockConnected(BlockState state) {
		return state.getBlock() instanceof IUBlockConnected;
	}
}