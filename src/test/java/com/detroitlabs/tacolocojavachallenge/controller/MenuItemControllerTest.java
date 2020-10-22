package com.detroitlabs.tacolocojavachallenge.controller;

import com.detroitlabs.tacolocojavachallenge.dto.OrderRequest;
import com.detroitlabs.tacolocojavachallenge.dto.OrderResponse;
import com.detroitlabs.tacolocojavachallenge.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
/**
 * Junit Test class for controller using JUnit4
 * @InjectMocks: This tells Mockito which class to inject mocks into
 * @Mock :OrderService inside the OrderService class is mocked
 * */

@RunWith(MockitoJUnitRunner.class)
public class MenuItemControllerTest {

    @InjectMocks
    private MenuItemController menuItemController;

    @Mock
    private OrderService orderService;

    @Test
    public void testGetTotalAmount() {

        List<OrderRequest> orderRequestList = new ArrayList<>();
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setDiscount(2.0f);
        Mockito.when(orderService.getTotalAmount(orderRequestList)).thenReturn(orderResponse);
        OrderResponse response = menuItemController.getTotalAmount(orderRequestList);
        assertEquals(2.0f, response.getDiscount(), 0.00001);
    }

}