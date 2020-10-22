package com.detroitlabs.tacolocojavachallenge.dto;
/**
 * Domain class for OrderRequest with name on order and quantity of tacos
 **/
public class OrderRequest {
    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
