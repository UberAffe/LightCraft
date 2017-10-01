package net.uberaffe.lightcraft;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.uberaffe.lightcraft.Items.ModItems;
import net.uberaffe.lightcraft.proxy.CommonProxy;

@Mod(modid=LightCraftMod.modId, name=LightCraftMod.name, version=LightCraftMod.version, acceptedMinecraftVersions="[1.12]")
public class LightCraftMod {

	public static final String modId = "lightcraft";
	public static final String name = "Light Craft";
	public static final String version = "1.0.0";
	
	@SidedProxy(serverSide="net.uberaffe.lightcraft.proxy.CommonProxy", clientSide="net.uberaffe.lightcraft.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(modId)
	public static LightCraftMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name+ " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}
}
