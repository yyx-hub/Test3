package com.bookstore.client.order.service;

import com.bookstore.client.order.dao.IOrderDao;
import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;
import com.bookstore.commons.beans.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/28 10:05
 */
@Service
public class OrderServiceImpl implements IOrderService{

    @Resource
    IOrderDao orderDao;


    @Override
    public void CreateOrder(Order order, Map<Product, Integer> cart) {
        //循环插入该订单对应的订单项信息
        for (Product p:cart.keySet()){
            OrderItem item =new OrderItem();
            item.setProduct(p);
            item.setOrder(order);
            item.setBuynum(cart.get(p));
            //插入订单项
            orderDao.insertOrderItem(item);
            //修改商品库存
            orderDao.updateProductnum(item);
        }
        //插入订单orders对应的信息
        orderDao.insertOrder(order);
    }

    @Override
    public void paySuccess(String order_id) {
        orderDao.updatePaystate(order_id);
    }
}
