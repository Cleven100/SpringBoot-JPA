package com.springapi.course.repositories;

import com.springapi.course.entities.OrderItem;
import com.springapi.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
