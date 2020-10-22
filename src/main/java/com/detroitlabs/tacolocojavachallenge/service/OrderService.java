package com.detroitlabs.tacolocojavachallenge.service;

import com.detroitlabs.tacolocojavachallenge.dto.OrderRequest;
import com.detroitlabs.tacolocojavachallenge.dto.OrderResponse;
import com.detroitlabs.tacolocojavachallenge.entity.Menu;
import com.detroitlabs.tacolocojavachallenge.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private MenuRepo menuRepo;

    public OrderResponse getTotalAmount(List<OrderRequest> orderRequestList) {
        OrderResponse orderResponse = new OrderResponse();
        float subtotal = 0.0f;
        int totalQuantitiy = 0;
        for (OrderRequest orderRequest : orderRequestList) {
            Menu menu = menuRepo.findByItem(orderRequest.getName());
            if(menu != null) {
                subtotal += orderRequest.getQuantity() * menu.getPrice();
                totalQuantitiy += orderRequest.getQuantity();
            }
        }
        orderResponse.setOrderRequestList(orderRequestList);
        orderResponse.setSubTotal(subtotal);
        if(totalQuantitiy >= 4) {
            orderResponse.setDiscount(subtotal*0.2f);
            orderResponse.setTotalPrice(subtotal * 0.8f);
        }
        orderResponse.setTotalPrice(subtotal);
        return orderResponse;
    }

}
