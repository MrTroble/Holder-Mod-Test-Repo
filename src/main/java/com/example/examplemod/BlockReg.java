package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockReg {

	public static Block blocktest = new BlockTest();
	
	@SubscribeEvent
	public static void reg_event(RegistryEvent.Register<Block> event) {
		System.out.println("LOl");
		IForgeRegistry<Block> registry = event.getRegistry();
		registry.register(blocktest);
	}
	
	@SubscribeEvent
	public static void reg_event_item(RegistryEvent.Register<Item> event) {
		System.out.println("LOl");
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(new ItemBlock(blocktest).setRegistryName(blocktest.getRegistryName()));
	}

}
