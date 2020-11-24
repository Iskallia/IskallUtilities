package iskallia.iskallutilities.common.block;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

public class IUBlockDirectional extends DirectionalBlock
{
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	
	public IUBlockDirectional(AbstractBlock.Properties properties)
	{
		super(properties);
	}
	
	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		builder.add(FACING);
	}
	
	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context)
	{
		return super.getStateForPlacement(context).with(FACING, context.getNearestLookingDirection().getOpposite());
	}
}
