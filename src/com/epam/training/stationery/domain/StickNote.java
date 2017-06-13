package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class StickNote extends Stationery {

	private String color;

	private Message message;

	public StickNote(){

	}

	public StickNote(Message message){
		this.message = message;
	}

	public StickNote(String name, int price) {
		super(name, price);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
