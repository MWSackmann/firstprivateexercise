package com.company;

/**
 * Created by sackmann on 01.08.2017.
 */
public class OrderItem {

    private String lineNumber;
    private String text;

    public OrderItem(String lineNumber, String text) {
        this.lineNumber = lineNumber;
        this.text = text;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
