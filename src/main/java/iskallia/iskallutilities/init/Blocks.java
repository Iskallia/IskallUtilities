package iskallia.iskallutilities.init;

import static iskallia.iskallutilities.common.block.IUBlocks.*;

import iskallia.iskallutilities.common.block.IUBlockBase;
import iskallia.iskallutilities.common.block.IUBlockDirectional;
import iskallia.iskallutilities.common.block.IUBlockHorizontal;
import iskallia.iskallutilities.common.block.TrapDoorBlockIndustrial;
import iskallia.iskallutilities.common.util.IUSoundType;
import iskallia.iskallutilities.common.util.inventory.IUItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
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
		corrugated_metal_sheet_3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "corrugated_metal_sheet_3");
		corrugated_metal_sheet_4 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "corrugated_metal_sheet_4");
		dark_rusty_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "dark_rusty_metal_plate");
		gray_metal_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal_rivets");
		gray_metal_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal_rivets_2");
		gray_metal = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal");
		gray_metal_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "gray_metal_2");
		light_gray_metal_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal_rivets");
		light_gray_metal_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal_rivets_2");
		light_gray_metal = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal");
		light_gray_metal_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_gray_metal_2");
		light_metal_plate_rusty_edge_red = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_red");
		light_metal_plate_rusty_edge_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_rivets");
		light_metal_plate_rusty_edge_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_rivets_2");
		light_metal_plate_rusty_edge_rivets_3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate_rusty_edge_rivets_3");
		light_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "light_metal_plate");
		lightly_weathered_concrete_1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lightly_weathered_concrete_1");
		lightly_weathered_concrete_4 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lightly_weathered_concrete_4");
		metal_air_duct_1 = registerBlock(new RotatedPillarBlock(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.DUCT).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_1");
		metal_air_duct_3 = registerBlock(new RotatedPillarBlock(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.DUCT).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_3");
		metal_air_duct_4 = registerBlock(new RotatedPillarBlock(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.DUCT).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_4");
		metal_air_duct_5 = registerBlock(new RotatedPillarBlock(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.DUCT).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_5");
		metal_air_duct_corner_2 = registerBlock(new IUBlockDirectional(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.DUCT).func_235861_h_().hardnessAndResistance(1.8F)), "metal_air_duct_corner_2");
		metal_plate_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rivets");
		metal_plate_rusty_edge_red = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rusty_edge_red");
		metal_plate_rusty_edge_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rusty_edge_rivets");
		metal_plate_rusty_edge = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate_rusty_edge");
		metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "metal_plate");
		plain_concrete = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "plain_concrete");
		rusty_concrete_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_concrete_metal_plate");
		rusty_corrugated_metal_sheet_1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_corrugated_metal_sheet_1");
		rusty_corrugated_metal_sheet_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_corrugated_metal_sheet_2");
		rusty_metal_plate_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate_rivets");
		rusty_metal_plate_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate_rivets_2");
		rusty_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate");
		rusty_metal_plate_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "rusty_metal_plate_2");
		semi_metal_plate_rivets_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "semi_metal_plate_rivets_2");
		semi_rusty_metal_plate_rivets = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "semi_rusty_metal_plate_rivets");
		semi_rusty_metal_plate = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "semi_rusty_metal_plate");
		semi_rusty_metal_plate_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).sound(IUSoundType.INDUSTRIAL_METAL).func_235861_h_().hardnessAndResistance(1.8F)), "semi_rusty_metal_plate_2");
		weathered_concrete_2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_2");
		weathered_concrete_3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_3");
		weathered_concrete_5 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_5");
		weathered_concrete_6 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "weathered_concrete_6");
		
		caution_line1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line1");
		caution_line10 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line10");
		caution_line11 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line11");
		caution_line12 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line12");
		caution_line13 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line13");
		caution_line14 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line14");
		caution_line15 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line15");
		caution_line16 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line16");
		caution_line17 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line17");
		caution_line18 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line18");
		caution_line2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line2");
		caution_line3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line3");
		caution_line4 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line4");
		caution_line5 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line5");
		caution_line6 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line6");
		caution_line7 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line7");
		caution_line8 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line8");
		caution_line9 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "caution_line9");
		concrete_line1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "concrete_line1");
		concrete_line2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "concrete_line2");
		
		spacex_0005_space40 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0005_space40");
		spacex_0006_space39 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0006_space39");
		spacex_0008_space38 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0008_space38");
		spacex_0010_space37 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0010_space37");
		spacex_0010_space41 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0010_space41");
		spacex_0011_space36 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0011_space36");
		spacex_0017_space35 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0017_space35");
		spacex_0018_space34 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0018_space34");
		spacex_0019_space33 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0019_space33");
		spacex_0020_space32 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0020_space32");
		spacex_0021_space31 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0021_space31");
		spacex_0022_space30 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0022_space30");
		spacex_0023_space29 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0023_space29");
		spacex_0024_space28 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0024_space28");
		spacex_0025_space27 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0025_space27");
		spacex_0026_space26 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0026_space26");
		spacex_0027_space25 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0027_space25");
		spacex_0028_space24 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0028_space24");
		spacex_0038_space14 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0038_space14");
		spacex_0039_space13 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0039_space13");
		spacex_0040_space12 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0040_space12");
		spacex_0041_space11 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0041_space11");
		spacex_0042_space10 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0042_space10");
		spacex_0043_space9 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0043_space9");
		spacex_0044_space8 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0044_space8");
		spacex_0045_space7 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0045_space7");
		spacex_0046_space6 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0046_space6");
		spacex_0047_space5 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0047_space5");
		spacex_0048_space4re = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0048_space4re");
		spacex_0049_space4 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0049_space4");
		spacex_0050_space3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0050_space3");
		spacex_0051_space2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0051_space2");
		spacex_0052_space1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "spacex_0052_space1");
		
		air_vent = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "air_vent");
		control_panel1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "control_panel1");
		control_panel2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "control_panel2");
		electrical_outlet = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "electrical_outlet");
		lab_wall_monitor = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab_wall_monitor");
		lab1 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab1");
		lab10 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab10");
		lab11 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab11");
		lab12 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab12");
		lab13 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab13");
		lab14 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab14");
		lab15 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab15");
		lab16 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab16");
		lab17 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab17");
		lab18 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab18");
		lab19 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab19");
		lab2 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab2");
		lab20 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab20");
		lab21 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab21");
		lab22 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab22");
		lab23 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab23");
		lab24 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab24");
		lab25 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab25");
		lab26 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab26");
		lab27 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab27");
		lab28 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab28");
		lab29 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab29");
		lab3 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab3");
		lab30 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab30");
		lab31 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab31");
		lab5 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab5");
		lab6 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab6");
		lab7 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab7");
		lab8 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab8");
		lab9 = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "lab9");
		
		asphalt2 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt2");
		asphalt3 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt3");
		asphalt4 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt4");
		asphalt5 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt5");
		asphalt6 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt6");
		asphalt7 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt7");
		asphalt8 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt8");
		asphalt9 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt9");
		asphalt10 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt10");
		asphalt11 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt11");
		asphalt12 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt12");
		asphalt13_pothole = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt13_pothole");
		asphalt_caution = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_caution");
		asphalt_fade1 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade1");
		asphalt_fade2 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade2");
		asphalt_fade3 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade3");
		asphalt_fade4 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade4");
		asphalt_fade6 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade6");
		asphalt_fade7 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade7");
		asphalt_fade_dirt = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade_dirt");
		asphalt_fade_top = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_fade_top");
		asphalt_light10 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light10");
		asphalt_light11 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light11");
		asphalt_light12 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light12");
		asphalt_light13 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light13");
		asphalt_light14 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light14");
		asphalt_light6 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light6");
		asphalt_light7 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light7");
		asphalt_light8 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light8");
		asphalt_light9 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light9");
		asphalt_light_dirt = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light_dirt");
		asphalt_light_pothole = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light_pothole");
		asphalt_light_top = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_light_top");
		asphalt_side = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_side");
		asphalt_top2 = registerBlock(new IUBlockHorizontal(AbstractBlock.Properties.create(Material.ROCK).func_235861_h_().hardnessAndResistance(1.8F)), "asphalt_top2");
		
		metal_trapdoor_vent = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "metal_trapdoor_vent");
		spacex_0029_space23 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0029_space23");
		spacex_0030_space22 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0030_space22");
		spacex_0031_space21 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0031_space21");
		spacex_0032_space20 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0032_space20");
		spacex_0033_space19 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0033_space19");
		spacex_0034_space18 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0034_space18");
		spacex_0035_space17 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0035_space17");
		spacex_0036_space16 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0036_space16");
		spacex_0037_space15 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)), "spacex_0037_space15");
		steaming_metal_trapdoor_vent = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_metal_trapdoor_vent");
		steaming_spacex_0029_space23 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0029_space23");
		steaming_spacex_0030_space22 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0030_space22");
		steaming_spacex_0031_space21 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0031_space21");
		steaming_spacex_0032_space20 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0032_space20");
		steaming_spacex_0033_space19 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0033_space19");
		steaming_spacex_0034_space18 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0034_space18");
		steaming_spacex_0035_space17 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0035_space17");
		steaming_spacex_0036_space16 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0036_space16");
		steaming_spacex_0037_space15 = registerBlock(new TrapDoorBlockIndustrial(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.8F).sound(SoundType.METAL).notSolid().func_235827_a_(Blocks::dunnoWhatThisIs)).setSteaming(), "steaming_spacex_0037_space15");
		
		digital_key_pad = registerBlock(new IUBlockDirectional(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(1.0F).notSolid()), "digital_key_pad");
		old_style_light = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON, MaterialColor.QUARTZ).func_235861_h_().hardnessAndResistance(1.8F).notSolid().func_235838_a_((l) -> { return 15; })), "old_style_light");
		power_container = registerBlock(new IUBlockBase(AbstractBlock.Properties.create(Material.IRON).func_235861_h_().hardnessAndResistance(2.0F).notSolid()), "power_container");
		
		if (FMLEnvironment.dist == Dist.CLIENT)
		{
			RenderTypeLookup.setRenderLayer(metal_trapdoor_vent, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_metal_trapdoor_vent, RenderType.getCutout());
			
			RenderTypeLookup.setRenderLayer(digital_key_pad, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(old_style_light, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(power_container, RenderType.getCutout());
			
			RenderTypeLookup.setRenderLayer(spacex_0029_space23, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0030_space22, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0031_space21, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0032_space20, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0033_space19, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0034_space18, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0035_space17, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0036_space16, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(spacex_0037_space15, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0029_space23, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0030_space22, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0031_space21, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0032_space20, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0033_space19, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0034_space18, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0035_space17, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0036_space16, RenderType.getCutout());
			RenderTypeLookup.setRenderLayer(steaming_spacex_0037_space15, RenderType.getCutout());
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
	
	private static Boolean dunnoWhatThisIs(BlockState p_235427_0_, IBlockReader p_235427_1_, BlockPos p_235427_2_, EntityType<?> p_235427_3_)
	{
		return (boolean)false;
	}
}
