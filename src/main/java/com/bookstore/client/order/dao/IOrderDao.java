package com.bookstore.client.order.dao;

import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/28 10:18
 */
public interface IOrderDao {
    void insertOrder(Order order);

    void insertOrderItem(OrderItem item);

    void updateProductnum(OrderItem item);

    void updatePaystate(String order_id);
}
