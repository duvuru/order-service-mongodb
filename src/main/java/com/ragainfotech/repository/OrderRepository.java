package com.ragainfotech.repository;

import com.ragainfotech.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {

    public Optional<Order> findByOrderRefNumber(int orderRefNumber);
}
