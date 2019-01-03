package com.example.examplemod;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preinit() {
		System.out.println("Pre init");
		MinecraftForge.EVENT_BUS.register(BlockReg.class);
		GameRegistry.registerTileEntity(TestTileEntity.class, new ResourceLocation(ExampleMod.MODID, "testtile"));
	}
	
}
