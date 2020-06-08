package com.bookstore.admin.login.service;

import com.bookstore.commons.beans.User;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/11 11:27
 */
public interface IAdminUserService {
    User findUserByLogin(User user);
}
