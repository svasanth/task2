package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public class Pencil extends Stationery implements Writable{

	private StickNote stickNote;

	public Pencil(String name, int price) {
		super(name, price);
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
