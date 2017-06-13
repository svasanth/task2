package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public abstract class Stationery {

	private String name;
	private int price;

	public Stationery() {
	}

	public Stationery(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
