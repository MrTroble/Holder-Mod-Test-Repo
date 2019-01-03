package com.example.examplemod;

import net.minecraft.entity.EntityCreature;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.AxisAlignedBB;

public class TestTileEntity extends TileEntity implements ITickable{

	@Override
	public void update() {
		if(this.world.isBlockPowered(this.pos))return;
		this.world.getEntitiesWithinAABB(EntityCreature.class, new AxisAlignedBB(this.pos.add(-5, -5, -5), this.pos.add(5,5,5))).forEach(entity->{
			entity.posX = this.pos.getX() + 0.5;
			entity.posY = this.pos.getY() + 1;
			entity.posZ = this.pos.getZ() + 0.5;
			entity.lastTickPosX = entity.posX;
			entity.lastTickPosY = entity.posY;
			entity.lastTickPosZ = entity.posZ;
			entity.motionX = 0;
			entity.motionY = 0;
			entity.motionZ = 0;
	        this.world.updateEntityWithOptionalForce(entity, false);
		});
	}
	
}
