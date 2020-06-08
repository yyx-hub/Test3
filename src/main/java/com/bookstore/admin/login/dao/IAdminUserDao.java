package com.bookstore.admin.login.dao;

import com.bookstore.commons.beans.User;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/11 11:30
 */
public interface IAdminUserDao {
    User selectUserByLogin(User user);
}
