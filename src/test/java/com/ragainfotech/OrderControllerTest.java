package com.ragainfotech;

import com.ragainfotech.controller.OrderController;
import com.ragainfotech.model.Order;
import com.ragainfotech.repository.OrderRepository;
import com.ragainfotech.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class OrderControllerTest {

    @Mock
    OrderService orderService;

    @InjectMocks
    OrderController controller;

   static List<Order> orders;

    @BeforeAll
    static void before(){
        orders = new ArrayList<Order>();
        orders.add(new Order());
        orders.add(new Order());
    }

    @Test
    void testGetOrders(){

        Mockito.when(orderService.getOrders())
                .thenReturn(orders);
        Assertions.assertEquals(2,controller.getOrders().size());
    }
}
