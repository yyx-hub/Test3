package com.bookstore.client.order.service;

import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.Product;

import java.util.Map;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/28 10:05
 */
public interface IOrderService {

    void CreateOrder(Order order, Map<Product, Integer> cart);

    void paySuccess(String order_id);
}
