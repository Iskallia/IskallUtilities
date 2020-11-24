package iskallia.iskallutilities.common.util;

import iskallia.iskallutilities.core.IskallUtilities;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

@net.minecraftforge.registries.ObjectHolder("iskallutilities")
public class IUSoundEvents
{
	public static final SoundEvent BLOCK_INDUSTRIAL_BREAK = register("industrialmetal.break");
	public static final SoundEvent BLOCK_INDUSTRIAL_STEP = register("industrialmetal.step");
	public static final SoundEvent BLOCK_INDUSTRIAL_PLACE = register("industrialmetal.place");
	public static final SoundEvent BLOCK_INDUSTRIAL_HIT = register("industrialmetal.step");
	public static final SoundEvent BLOCK_INDUSTRIAL_FALL = register("industrialmetal.break");
	
	public static final SoundEvent BLOCK_DUCT_BREAK = register("duct.break");
	public static final SoundEvent BLOCK_DUCT_STEP = register("duct.step");
	public static final SoundEvent BLOCK_DUCT_PLACE = register("duct.place");
	public static final SoundEvent BLOCK_DUCT_HIT = register("duct.hit");
	public static final SoundEvent BLOCK_DUCT_FALL = register("duct.fall");
	
	public static final SoundEvent BLOCK_METAL_TRAPDOOR_OPEN = register("metaltrapdoor.open");
	public static final SoundEvent BLOCK_METAL_TRAPDOOR_CLOSE = register("metaltrapdoor.close");
	
	//@SuppressWarnings("deprecation")
	private static SoundEvent register(String key)
	{
		return new SoundEvent(new ResourceLocation(IskallUtilities.MOD_ID, key));
		//return Registry.register(Registry.SOUND_EVENT, key, new SoundEvent(new ResourceLocation(IskallUtilities.MOD_ID, key)));
	}
}
