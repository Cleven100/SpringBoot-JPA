package com.springapi.course.services;

import com.springapi.course.entities.Order;
import com.springapi.course.entities.User;
import com.springapi.course.repositories.OrderRepository;
import com.springapi.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }


    public Order findById(long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
