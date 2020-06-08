package com.bookstore.admin.Interceptor;

import com.bookstore.commons.beans.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/13 11:11
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        if (url.endsWith("/login")||url.endsWith("logout")){
            return true;
        }
        User login_user = (User) request.getSession().getAttribute("login_user");
        if (login_user != null){
            if ("超级管理员".equals(login_user.getRole())){
                return true;
            }else{
                //重定向response.sendRedirect为特例 一定要在前面加上request.getContextPath()+
                response.sendRedirect(request.getContextPath()+"/admin/error/privilege.jsp");
                return false;
            }
        }else{
            response.sendRedirect(request.getContextPath()+"/admin/error/privilege.jsp");
            return false;
        }

    }
}
