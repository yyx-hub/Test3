package com.bookstore.client.user.service;
/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/07 11:23
 */
import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;
import com.bookstore.commons.beans.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IUserService {
    int addUser(User user, HttpServletRequest request);

    int activeUser(String activeCode);

    User findEmail(String email);

    User findUsername(String username);

    User findUserByLogin(User user);

    int modifyUser(User user);

    List<Order> findOrderByUser(Integer id);

    List<OrderItem> findOrderItemById(String id);

    void removeOrderById(String id, String flag);
}
