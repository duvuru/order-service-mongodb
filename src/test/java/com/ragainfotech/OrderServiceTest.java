package com.ragainfotech;

import com.ragainfotech.model.Order;
import com.ragainfotech.repository.OrderRepository;
import com.ragainfotech.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class OrderServiceTest {
    @Mock
    OrderRepository orderRepository;
    @InjectMocks
    OrderService service;
    static List<Order> orders;
    static {
        orders = new ArrayList<Order>();
        orders.add(new Order());
        orders.add(new Order());
    }

    @Test
    void testGetOrders(){
        Mockito.when(orderRepository.findAll()).thenReturn(orders);
        Assertions.assertEquals(2,service.getOrders().size());
    }
}
