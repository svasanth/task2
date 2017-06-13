package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class Stapler extends Stationery {

	private int pinCapacity;

	public Stapler(String name, int price) {
		super(name, price);
	}

	public int getPinCapacity() {
		return pinCapacity;
	}

	public void setPinCapacity(int pinCapacity) {
		this.pinCapacity = pinCapacity;
	}
}
