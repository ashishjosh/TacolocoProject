package com.detroitlabs.tacolocojavachallenge.service;

import com.detroitlabs.tacolocojavachallenge.dto.OrderRequest;
import com.detroitlabs.tacolocojavachallenge.entity.Menu;
import com.detroitlabs.tacolocojavachallenge.repository.MenuRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
/**
 * JUnit Test class for testing service or business logic
 */


@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @InjectMocks
    private OrderService orderService;

    @Mock
    private MenuRepo menuRepo;

    private List<OrderRequest> orderRequestList = new ArrayList<>();

    private Menu menu = new Menu();

    @Before
    public void setup() {
        menu.setId(0);
        menu.setItem("item");
        menu.setPrice(2.5f);
        for(int i = 0; i<=4; i++) {
            OrderRequest orderRequest = new OrderRequest();
            orderRequest.setName("Item"+i);
            orderRequest.setQuantity(i);
            orderRequestList.add(orderRequest);
        }
    }
    @Test
    public void testGetTotalAmount() {
        Mockito.when(menuRepo.findByItem(ArgumentMatchers.anyString())).thenReturn(menu);
        orderService.getTotalAmount(orderRequestList);
    }

}