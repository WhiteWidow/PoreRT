package net.amigocraft.pore.implementation.entity;

import org.apache.commons.lang.NotImplementedException;
import org.bukkit.Material;
import org.bukkit.entity.FallingSand;

public class PoreFallingSand extends PoreEntity implements FallingSand {

	//TODO: Bridge

	public PoreFallingSand(org.spongepowered.api.entity.Entity handle) { //TODO: accept most specfific type
		super(handle);
	}

	@Override
	public Material getMaterial() {
		throw new NotImplementedException();
	}

	@Override
	public int getBlockId() {
		return 0;
	}

	@Override
	public byte getBlockData() {
		return 0;
	}

	@Override
	public boolean getDropItem() {
		return false;
	}

	@Override
	public void setDropItem(boolean drop) {
		throw new NotImplementedException();
	}
}
