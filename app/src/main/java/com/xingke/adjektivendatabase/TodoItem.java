package com.xingke.adjektivendatabase;

/**
 * Created by Xingke on 25/07/2015.
 */
public class TodoItem {
    private int id;
    private String adjektiv;

    public TodoItem(String adjektiv){
        super();
        this.adjektiv = adjektiv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdjektiv() {
        return adjektiv;
    }

    public void setAdjektiv(String adjektiv) {
        this.adjektiv = adjektiv;
    }
}
