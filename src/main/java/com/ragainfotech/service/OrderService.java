package com.ragainfotech.service;

import com.ragainfotech.model.Order;
import com.ragainfotech.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order saveOrder(Order order){

        return orderRepository.save(order);
    }

    public Order updateOrder(Order order){
        return orderRepository.save(order);
    }
    public Order getOrder(Integer orderRef) {
        Optional<Order> orderOptional = orderRepository.findByOrderRefNumber(orderRef);
        if(orderOptional.isPresent()){
            System.out.println(orderOptional.get());
            return orderOptional.get();
        }
        return null;
    }

    public String deleteOrderById(int orderId){
        orderRepository.deleteById(orderId);
        return "Order :"+orderId+" has been deleted!!!";
    }

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }
}
