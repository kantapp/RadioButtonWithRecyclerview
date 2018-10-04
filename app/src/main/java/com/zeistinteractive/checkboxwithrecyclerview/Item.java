package com.zeistinteractive.checkboxwithrecyclerview;

/**
 * Created by Kantapp Inc. on 10/4/2018.
 */
public class Item {

    private String name;
    private String surname;

    public Item(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        Item itemCompare = (Item) obj;
        if(itemCompare.getName().equals(this.getName()))
            return true;

        return false;
    }
}