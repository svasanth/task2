package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class Pen extends AbstractWritableComponents{

	//Represents blue/black
	private String color;

	public Pen(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
