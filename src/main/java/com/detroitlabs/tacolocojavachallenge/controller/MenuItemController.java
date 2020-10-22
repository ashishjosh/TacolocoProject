package com.detroitlabs.tacolocojavachallenge.controller;

import com.detroitlabs.tacolocojavachallenge.dto.OrderRequest;
import com.detroitlabs.tacolocojavachallenge.dto.OrderResponse;
import com.detroitlabs.tacolocojavachallenge.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
public class MenuItemController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/totalAmount")
    @ResponseStatus(HttpStatus.OK)
    public OrderResponse getTotalAmount(@RequestBody List<OrderRequest> orderRequestLists) {
        return orderService.getTotalAmount(orderRequestLists);
    }


}
