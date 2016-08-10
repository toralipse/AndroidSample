package com.example.toralipse.apptest;

import io.realm.RealmObject;

/**
 * Created by toralipse on 2016/08/10.
 */
public class Item extends RealmObject{
    private String name;
    private int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
