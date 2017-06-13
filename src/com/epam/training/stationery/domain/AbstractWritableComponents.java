package com.epam.training.stationery.domain;

/**
 * Created by Sydubabu_Vasantha on 6/13/2017.
 */
public abstract class AbstractWritableComponents extends Stationery implements Writable{

    private StickNote stickNote;

    public StickNote getStickNote() {
        return stickNote;
    }

    public void setStickNote(StickNote stickNote) {
        this.stickNote = stickNote;
    }


    public AbstractWritableComponents(String name, int price) {
        super(name, price);
    }

    @Override
    public StickNote writeOnStickNote(String msg) {
        Message message = new Message(msg);
        StickNote stickNote = new StickNote();
        stickNote.setMessage(message);

        return stickNote;
    }
}
