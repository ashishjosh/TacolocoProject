package com.detroitlabs.tacolocojavachallenge.entity;

import javax.persistence.*;

@Entity

public class  Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String item;
    private float price;

    public Menu() {
    }

    public Menu(String item, float price) {
        this.item = item;
        this.price = price;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
