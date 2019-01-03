package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class BlockTest extends Block implements ITileEntityProvider{

	public BlockTest() {
		super(Material.ROCK);
		this.setRegistryName(new ResourceLocation(ExampleMod.MODID, "test"));
		this.setCreativeTab(CreativeTabs.REDSTONE);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TestTileEntity();
	}

}
