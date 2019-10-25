package com.example.a3634homework2;

public class MenuItem {

    //menu item identifier- IMPORTANT
    private int menuItemID;

    private String item;
    private String itemDescription;
    public String itemPrice;
    private int picDrawableID;

    public MenuItem(int menuItemID, String item, String itemDescription, String itemPrice, int picDrawableID) {
        this.menuItemID = menuItemID;
        this.item = item;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;

        this.picDrawableID = picDrawableID;
    }
    public int getMenuItemID() {return menuItemID;}
    public void setMenuItemID(int menuItemID) {this.menuItemID=menuItemID;}

    public String getItem() {return item;}
    public void setItem(String item) {this.item = item;}

    public String getItemDescription() {return itemDescription;}
    public void setItemDescription(String itemDescription) {this.itemDescription = itemDescription;}

    public String getItemPrice() {return itemPrice;}
    public void setItemPrice(String itemPrice) {this.itemPrice = itemPrice;}

    public int getPicDrawableID() {return picDrawableID;}
    public void setPicDrawableID(int picDrawableID) {this.picDrawableID=picDrawableID;}
}
