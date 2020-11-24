package iskallia.iskallutilities.common.util;

import net.minecraft.block.SoundType;

public class IUSoundType
{
	public static final SoundType INDUSTRIAL_METAL = new SoundType(
			1.0F, 
			1.0F, 
			IUSoundEvents.BLOCK_INDUSTRIAL_BREAK, 
			IUSoundEvents.BLOCK_INDUSTRIAL_STEP, 
			IUSoundEvents.BLOCK_INDUSTRIAL_PLACE, 
			IUSoundEvents.BLOCK_INDUSTRIAL_HIT, 
			IUSoundEvents.BLOCK_INDUSTRIAL_FALL);
	
	public static final SoundType DUCT = new SoundType(
			1.0F,
			1.0F,
			IUSoundEvents.BLOCK_DUCT_BREAK,
			IUSoundEvents.BLOCK_DUCT_STEP,
			IUSoundEvents.BLOCK_DUCT_PLACE,
			IUSoundEvents.BLOCK_DUCT_HIT,
			IUSoundEvents.BLOCK_DUCT_FALL);
}
