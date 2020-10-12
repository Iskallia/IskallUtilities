package iskallia.iskallutilities.common.util.inventory;

import iskallia.iskallutilities.common.block.IUBlocks;
import iskallia.iskallutilities.core.IskallUtilities;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class IUItemGroup extends ItemGroup
{
	public static final IUItemGroup instance = new IUItemGroup(ItemGroup.getGroupCountSafe(), IskallUtilities.MOD_ID);
	
	public IUItemGroup(int index, String label)
	{
		super(index, label);
	}
	
	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(IUBlocks.concrete_metal_plate);
	}
}
