package com.detroitlabs.tacolocojavachallenge.dto;
import java.util.List;

public class OrderResponse {
    /**
     * @subTotal : total amount of tacos purchased in dollar
     * @discount : 20% of orderTotalAmount is offered if order contains any 4 or more than 4 tacos
     * @totalprice : the price after discount
     * This class is domain class to display the order response as per the business logic
     * */
    private List<OrderRequest> orderRequestList;
    private float subTotal;
    private float discount;
    private float totalPrice;

    //empty constructor
    public OrderResponse() {

    }
    // list of order request for tacos
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
