package com.bookstore.admin.orders.dao;

import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/27 11:28
 */
public interface IOrdersDao {
    List<Order> selectOrders();
    //mybatis会自动识别order对象的值，传到xml文件中，所以需要给对象指定映射。在对象添加上@Param注解，可解决这个问题。
    List<Order> selectOrderByManyCondition(@Param("order") Order order,@Param("receiverName") String receiverName);

    List<OrderItem> selectOrderItemById(String id);

    void deleteOrderById(String id);

    void deleteOrderItemById(String id);

    void updateProductnum(OrderItem item);
}
