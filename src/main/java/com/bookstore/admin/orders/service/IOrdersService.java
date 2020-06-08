package com.bookstore.admin.orders.service;

import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;

import java.util.List;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/27 11:28
 */
public interface IOrdersService {
    List<Order> findOrderById();

    List<Order> findOrderByManyCondition(Order order,String receiverName);

    List<OrderItem> findOrderItemById(String id);

    void removeOrderById(String id, String flag);
}
