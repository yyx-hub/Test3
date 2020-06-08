package com.bookstore.admin.login.handler;

import com.bookstore.admin.login.service.IAdminUserService;
import com.bookstore.commons.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/11 11:02
 */

@Controller
@RequestMapping("/admin/login")
public class AdminUserHandler {

    @Autowired
    IAdminUserService adminUserService;

    @RequestMapping("/login")
    public String login(User user, HttpSession session, Model model){
        System.out.println("登录用户："+user);
        User login_user = adminUserService.findUserByLogin(user);
        if (login_user != null){
            //用户名和密码正确，并且用户是超级管理员
            if ("超级管理员".equals(login_user.getRole())){
                session.setAttribute("login_user",login_user);
                return "/admin/login/home.jsp";
            }else{
                //用户名和密码正确，但是是普通用户
                return "/admin/error/privilege.jsp";
            }

        }else{
            model.addAttribute("fail","用户名或密码输入错误，请重新输入！");
            return "/admin/login/login.jsp";
        }

    }

    //用户退出
    @RequestMapping("/logout")
    public String logout(HttpSession session,Model model){
        session.removeAttribute("login_user");
        model.addAttribute("fail","用户退出成功，请重新登陆！");
        return "/admin/login/login.jsp";

    }
}
