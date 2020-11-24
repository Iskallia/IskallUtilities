package iskallia.iskallutilities.common.block;

import java.util.Random;

import javax.annotation.Nullable;

import iskallia.iskallutilities.common.util.IUSoundEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TrapDoorBlockIndustrial extends TrapDoorBlock
{
	private boolean steaming;
	
	public TrapDoorBlockIndustrial(AbstractBlock.Properties properties, boolean isSteaming)
	{
		super(properties);
		
		steaming = isSteaming;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState state, World world, BlockPos pos, Random rand)
	{
		if (rand.nextInt(5) == 0 && steaming)
		{
			spawnSmokeParticles(world, pos, false, false);
		}
	}
	
	public static void spawnSmokeParticles(World world, BlockPos pos, boolean isSignalFire, boolean spawnExtraSmoke)
	{
		Random random = world.getRandom();
		
		BasicParticleType basicparticletype = isSignalFire ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.CAMPFIRE_COSY_SMOKE;
		
		world.addOptionalParticle(
				basicparticletype, 
				true, 
				(double)pos.getX() + 0.5D + random.nextDouble() / 3.0D * (double)(random.nextBoolean() ? 1 : -1), 
				(double)pos.getY() + 0.1D + random.nextDouble() + random.nextDouble(), 
				(double)pos.getZ() + 0.5D + random.nextDouble() / 3.0D * (double)(random.nextBoolean() ? 1 : -1), 
				0.0D, 
				0.06D, 
				0.0D);
		
		if (spawnExtraSmoke)
		{
			world.addParticle(
					ParticleTypes.SMOKE, 
					(double)pos.getX() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1), 
					(double)pos.getY() + 0.4D, 
					(double)pos.getZ() + 0.25D + random.nextDouble() / 2.0D * (double)(random.nextBoolean() ? 1 : -1), 
					0.0D, 
					0.005D, 
					0.0D);
		}
	}
	
	@Override
	protected void playSound(@Nullable PlayerEntity player, World world, BlockPos pos, boolean open)
	{
		if (open)
		{
			world.playSound(player, pos, IUSoundEvents.BLOCK_METAL_TRAPDOOR_OPEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
		else
		{
			world.playSound(player, pos, IUSoundEvents.BLOCK_METAL_TRAPDOOR_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
		}
	}
}
