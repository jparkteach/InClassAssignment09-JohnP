package net.jptechnology.android.inclassassignment09_johnp;

/**
 * Created by johnpark on 4/3/17.
 */

public class message {
    private String text;

    public message() {
    }

    public message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
