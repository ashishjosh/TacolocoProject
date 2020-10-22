package com.detroitlabs.tacolocojavachallenge.dto;
import java.util.List;

public class OrderResponse {
    private List<OrderRequest> orderRequestList;
    private float subTotal;
    private float discount;
    private float totalPrice;

    public OrderResponse() {

    }

    public List<OrderRequest> getOrderRequestList() {
        return orderRequestList;
    }

    public void setOrderRequestList(List<OrderRequest> orderRequestList) {
        this.orderRequestList = orderRequestList;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderResponse(float totalPrice) {
        this.totalPrice = totalPrice;
    }


}
