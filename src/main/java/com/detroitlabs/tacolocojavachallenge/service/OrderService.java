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
       float subTotal = 0.0f;

        int totalQuantity = 0;
        for (OrderRequest orderRequest : orderRequestList) {
            Menu menu = menuRepo.findByItem(orderRequest.getName());
            if(menu != null) { // menu null pointer handle
                subTotal += orderRequest.getQuantity() * menu.getPrice();
                totalQuantity += orderRequest.getQuantity();
            }
        }
        orderResponse.setOrderRequestList(orderRequestList);
        orderResponse.setSubTotal(subTotal);
        if(totalQuantity >= 4) {
            orderResponse.setDiscount(subTotal*0.2f);
            orderResponse.setTotalPrice(subTotal * 0.8f);
        }
        orderResponse.setTotalPrice(subTotal);
        return orderResponse;
    }

}
