package com.zeistinteractive.checkboxwithrecyclerview;

/**
 * Created by Kantapp Inc. on 10/4/2018.
 */
public class SelectableItem extends Item{
    private boolean isSelected = false;


    public SelectableItem(Item item,boolean isSelected) {
        super(item.getName(),item.getSurname());
        this.isSelected = isSelected;
    }


    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}