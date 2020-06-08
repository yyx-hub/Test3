package com.bookstore.admin.orders.handler;

import com.bookstore.admin.orders.service.IOrdersService;
import com.bookstore.commons.beans.Order;
import com.bookstore.commons.beans.OrderItem;
import com.bookstore.commons.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/5/27 11:28
 */

@Controller
@RequestMapping("/admin/orders")
public class OrdersHandler {

    @Autowired
    IOrdersService ordersService;

    //订单管理
    @RequestMapping("/findOrders")
    public String findOrders(Model model){
        List<Order> orders = ordersService.findOrderById();
        model.addAttribute("orders",orders);
        for (Order s: orders){
            System.out.println(s);
        }
        return "/admin/orders/list.jsp";
    }

    //按条件订单查询
    @RequestMapping("/findOrderByManyCondition")
    public String findOrderByManyCondition(Order order,Model model,String receiverName){
        List<Order> orders = ordersService.findOrderByManyCondition(order,receiverName);
        model.addAttribute("orders",orders);
        model.addAttribute("order",order);
        model.addAttribute("receiverName",receiverName);
        return "/admin/orders/list.jsp";
    }
    //查看订单信息
    @RequestMapping("/findOrderById")
    public String findOrderById(Model model,String id){
        List<OrderItem> items = ordersService.findOrderItemById(id);
        model.addAttribute("items",items);
        System.out.println(items);
        return "/admin/orders/view.jsp";
    }
    //删除订单信息
    @RequestMapping("/delOrderById")
    public String delOrderById(String id,String flag){
        ordersService.removeOrderById(id,flag);
        return "redirect:/admin/orders/findOrders";

    }
}
