package com.bookstore.client.user.service;
/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/07 11:23
 */
import com.bookstore.client.user.dao.IUserDao;
import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;
import com.bookstore.commons.beans.User;
import com.bookstore.utils.MailUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    IUserDao userDao;
    @Override
    public int addUser(User user, HttpServletRequest request) {
        String emailMsg = "感谢您使用网上书城，请点击<a href='http://localhost:8080"+request.getContextPath()+"/client/user/activeUser?activeCode="+user.getActiveCode()+"'>激活</a>后使用！";

        try {
            MailUtil.sendMail(user.getEmail(),emailMsg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return userDao.insertUser(user);
    }

    @Override
    public int activeUser(String activeCode) {
        return userDao.activeUser(activeCode);
    }

    @Override
    public User findEmail(String email) {
        return userDao.selectEmail(email);
    }

    @Override
    public User findUsername(String username) {
        return userDao.selectUsername(username);
    }

    @Override
    public User findUserByLogin(User user) {
        return userDao.selectUserByLogin(user);
    }

    @Override
    public int modifyUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public List<Order> findOrderByUser(Integer id) {
        return userDao.selectOrderByUser(id);
    }

    @Override
    public List<OrderItem> findOrderItemById(String id) {
        return userDao.selectOrderItemById(id);
    }

    @Override
    public void removeOrderById(String id, String flag) {
        //先加上商品库存 再删除订单等 防止 删除订单后 查询不到需要被加回库存的id
        if (flag == null){
            List<OrderItem> items = userDao.selectOrderItemById(id);
            //加回库存
            for (OrderItem item:items) {
                userDao.updateProductnum(item);
            }
        }
        //删除订单和订单项
        userDao.deleteOrderById(id);
        userDao.deleteOrderItemById(id);
    }
}
