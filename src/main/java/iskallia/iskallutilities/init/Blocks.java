package iskallia.iskallutilities.init;

import static iskallia.iskallutilities.common.block.IUBlocks.concrete_metal_plate;
import static iskallia.iskallutilities.common.block.IUBlocks.concrete_rusty_vent;
import static iskallia.iskallutilities.common.block.IUBlocks.corrugated_metal_sheet_3;
import static iskallia.iskallutilities.common.block.IUBlocks.corrugated_metal_sheet_4;
import static iskallia.iskallutilities.common.block.IUBlocks.dark_rusty_metal_plate;
import static iskallia.iskallutilities.common.block.IUBlocks.gray_metal;
import static iskallia.iskallutilities.common.block.IUBlocks.gray_metal_2;
import static iskallia.iskallutilities.common.block.IUBlocks.gray_metal_rivets;
import static iskallia.iskallutilities.common.block.IUBlocks.gray_metal_rivets_2;
import static iskallia.iskallutilities.common.block.IUBlocks.light_gray_metal;
import static iskallia.iskallutilities.common.block.IUBlocks.light_gray_metal_2;
import static iskallia.iskallutilities.common.block.IUBlocks.light_gray_metal_rivets;
import static iskallia.iskallutilities.common.block.IUBlocks.light_gray_metal_rivets_2;
import static iskallia.iskallutilities.common.block.IUBlocks.light_metal_plate;
import static iskallia.iskallutilities.common.block.IUBlocks.light_metal_plate_rusty_edge_red;
import static iskallia.iskallutilities.common.block.IUBlocks.light_metal_plate_rusty_edge_rivets;
import static iskallia.iskallutilities.common.block.IUBlocks.light_metal_plate_rusty_edge_rivets_2;
import static iskallia.iskallutilities.common.block.IUBlocks.light_metal_plate_rusty_edge_rivets_3;
import static iskallia.iskallutilities.common.block.IUBlocks.lightly_weathered_concrete_1;
import static iskallia.iskallutilities.common.block.IUBlocks.lightly_weathered_concrete_4;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_air_duct_1;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_air_duct_3;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_air_duct_4;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_air_duct_5;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_air_duct_corner_2;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_plate;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_plate_rivets;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_plate_rusty_edge;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_plate_rusty_edge_red;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_plate_rusty_edge_rivets;
import static iskallia.iskallutilities.common.block.IUBlocks.metal_trapdoor_vent;
import static iskallia.iskallutilities.common.block.IUBlocks.plain_concrete;
import static iskallia.iskallutilities.common.block.IUBlocks.rusty_concrete_metal_plate;
import static iskallia.iskallutilities.common.block.IUBlocks.rusty_corrugated_metal_sheet_1;
import static iskallia.iskallutilities.common.block.IUBlocks.rusty_corrugated_metal_sheet_2;
import static iskallia.iskallutilities.common.block.IUBlocks.rusty_metal_plate;
import static iskallia.iskallutilities.common.block.IUBlocks.rusty_metal_plate_2;
import static iskallia.iskallutilities.common.block.IUBlocks.rusty_metal_plate_rivets;
import static iskallia.iskallutilities.common.block.IUBlocks.rusty_metal_plate_rivets_2;
import static iskallia.iskallutilities.common.block.IUBlocks.semi_metal_plate_rivets_2;
import static iskallia.iskallutilities.common.block.IUBlocks.semi_rusty_metal_plate;
import static iskallia.iskallutilities.common.block.IUBlocks.semi_rusty_metal_plate_2;
import static iskallia.iskallutilities.common.block.IUBlocks.semi_rusty_metal_plate_rivets;
import static iskallia.iskallutilities.common.block.IUBlocks.weathered_concrete_2;
import static iskallia.iskallutilities.common.block.IUBlocks.weathered_concrete_3;
import static iskallia.iskallutilities.common.block.IUBlocks.weathered_concrete_5;
import static iskallia.iskallutilities.common.block.IUBlocks.weathered_concrete_6;

import iskallia.iskallutilities.common.block.IUBlockBase;
import iskallia.iskallutilities.common.util.inventory.IUItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks
{
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		concrete_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "concrete_metal_plate");
		concrete_rusty_vent = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "concrete_rusty_vent");
		corrugated_metal_sheet_3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "corrugated_metal_sheet_3");
		corrugated_metal_sheet_4 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "corrugated_metal_sheet_4");
		dark_rusty_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "dark_rusty_metal_plate");
		gray_metal_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal_rivets");
		gray_metal_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal_rivets_2");
		gray_metal = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal");
		gray_metal_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal_2");
		light_gray_metal_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal_rivets");
		light_gray_metal_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal_rivets_2");
		light_gray_metal = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal");
		light_gray_metal_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal_2");
		light_metal_plate_rusty_edge_red = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_red");
		light_metal_plate_rusty_edge_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_rivets");
		light_metal_plate_rusty_edge_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_rivets_2");
		light_metal_plate_rusty_edge_rivets_3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_rivets_3");
		light_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate");
		lightly_weathered_concrete_1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lightly_weathered_concrete_1");
		lightly_weathered_concrete_4 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lightly_weathered_concrete_4");
		metal_air_duct_1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_1");
		metal_air_duct_3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_3");
		metal_air_duct_4 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_4");
		metal_air_duct_5 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_5");
		metal_air_duct_corner_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_corner_2");
		metal_plate_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rivets");
		metal_plate_rusty_edge_red = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rusty_edge_red");
		metal_plate_rusty_edge_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rusty_edge_rivets");
		metal_plate_rusty_edge = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rusty_edge");
		metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate");
		metal_trapdoor_vent = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "metal_trapdoor_vent");
		plain_concrete = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "plain_concrete");
		rusty_concrete_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_concrete_metal_plate");
		rusty_corrugated_metal_sheet_1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_corrugated_metal_sheet_1");
		rusty_corrugated_metal_sheet_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_corrugated_metal_sheet_2");
		rusty_metal_plate_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate_rivets");
		rusty_metal_plate_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate_rivets_2");
		rusty_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate");
		rusty_metal_plate_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate_2");
		semi_metal_plate_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "semi_metal_plate_rivets_2");
		semi_rusty_metal_plate_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "semi_rusty_metal_plate_rivets");
		semi_rusty_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "semi_rusty_metal_plate");
		semi_rusty_metal_plate_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "semi_rusty_metal_plate_2");
		weathered_concrete_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_2");
		weathered_concrete_3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_3");
		weathered_concrete_5 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_5");
		weathered_concrete_6 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_6");
		
		if (FMLEnvironment.dist == Dist.CLIENT)
		{
			;
		}
	}
	
	public static Block registerBlock(Block block, String name)
	{
		BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(IUItemGroup.instance));
		
		block.setRegistryName(name);
		itemBlock.setRegistryName(name);
		
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(itemBlock);
		
		return block;
	}
}
