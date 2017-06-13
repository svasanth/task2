package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class Pen extends Stationery implements Writable {

	//Represents blue/black
	private String color;

	private StickNote stickNote;

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

	public StickNote getStickNote() {
		return stickNote;
	}

	public void setStickNote(StickNote stickNote) {
		this.stickNote = stickNote;
	}

	@Override
	public StickNote writeOnStickNote(String msg) {
		Message message = new Message(msg);
		StickNote stickNote = new StickNote();
		stickNote.setMessage(message);

		return stickNote;
	}
}
