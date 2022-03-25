package com.ragainfotech.controller;

import com.ragainfotech.model.Order;
import com.ragainfotech.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-api")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{orderRef}")
    public Order getOrder(@PathVariable Integer orderRef){
        return orderService.getOrder(orderRef);
    }

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @PostMapping("/placeOrder")
    public Order getOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

   @PutMapping("/updateOrder")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateOrder(order);
    }

    @DeleteMapping("/{orderId}")
    public String deleteOrderById(@PathVariable Integer orderId){
        return orderService.deleteOrderById(orderId);
    }


}
