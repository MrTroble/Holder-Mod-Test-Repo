package com.example.examplemod;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod {
		
	public static final String MODID = "lol";
	public static final String NAME = "Example Mod";
	public static final String VERSION = "1.0";

	public static Logger LOGGER;
	
	@SidedProxy(clientSide="com.example.examplemod.ClientProxy", serverSide="com.example.examplemod.CommonProxy")
	public static CommonProxy PROXY;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER = event.getModLog();
		PROXY.preinit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}

}
