package com.educandoweb.couse.repositories;

import com.educandoweb.couse.entities.OrderItem;
import com.educandoweb.couse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
