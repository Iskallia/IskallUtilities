package iskallia.iskallutilities.core;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IskallUtilities.MOD_ID)
public class IskallUtilities
{
	private static final Logger LOGGER = LogManager.getLogger();
	
	public static final String MOD_ID = "iskallutilities";
	public static CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	
	public IskallUtilities()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
		
		MinecraftForge.EVENT_BUS.register(this);
		
		//setup config
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		LOGGER.info("HELLO FROM PREINIT");
		LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
	}
	
	@SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event)
	{
		//register renders
		LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
	}
	
	private void enqueueIMC(final InterModEnqueueEvent event)
	{
		// some example code to dispatch IMC to another mod
		InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
	}
	
	private void processIMC(final InterModProcessEvent event)
	{
		// some example code to receive and process InterModComms from other mods
		LOGGER.info("Got IMC {}", event.getIMCStream().map(m->m.getMessageSupplier().get()).collect(Collectors.toList()));
	}
	
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event)
	{
		LOGGER.info("Server is starting");
	}
	
	public void loadComplete(final FMLLoadCompleteEvent event)
	{
		proxy.init();
	}
	
	// You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
	// Event bus for receiving Registry Events)
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
		{
			// register a new block here
			LOGGER.info("HELLO from Register Block");
		}
	}
}
