package com.bookstore.admin.orders.service;

import com.bookstore.admin.orders.dao.IOrdersDao;
import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/27 11:29
 */

@Service

public class OrdersServiceImpl implements IOrdersService {

    @Resource
    IOrdersDao ordersDao;

    @Override
    public List<Order> findOrderById() {
       return ordersDao.selectOrders();

    }

    @Override
    public List<Order> findOrderByManyCondition(Order order,String receiverName) {
        return ordersDao.selectOrderByManyCondition(order,receiverName);
    }

    @Override
    public List<OrderItem> findOrderItemById(String id) {
        return ordersDao.selectOrderItemById(id);
    }

    @Override
    public void removeOrderById(String id, String flag) {
        //删除订单和订单项
        ordersDao.deleteOrderById(id);
        ordersDao.deleteOrderItemById(id);
        if (flag == null) {
            List<OrderItem> items = ordersDao.selectOrderItemById(id);
            //加回库存
            for (OrderItem item:items){
                ordersDao.updateProductnum(item);
            }
        }
    }
}
