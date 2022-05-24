package com.polban.tekpro.monopoly;

public abstract class OwnedCell extends Cell {

	private boolean available = true;
	protected Player owner;

	public OwnedCell() {
		super();
	}

	public Player getOwner() {
		return owner;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

}