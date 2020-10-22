package com.detroitlabs.tacolocojavachallenge.entity;

import javax.persistence.*;

/**
 * Model class or POJO class representing the input variables, constructor, getter and setter methods
 * lombok can be used as alternate
 */
@Entity
//Table name is menu in H2 database
public class  Menu {
    @Id //Id is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //item column with same name item, hence, no need to add @column annotation
    private String item;
    //price column with same name price
    private float price;

    public Menu() {
    }

    // parameterized constructor
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
