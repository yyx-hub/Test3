package com.bookstore.client.cart.handler;

import com.bookstore.client.products.service.IProductService;
import com.bookstore.commons.beans.Product;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 杨宇翔
 * @version 1.0
 * @date 2020/4/26 11:10
 */

@Controller
@RequestMapping("/client/cart")
public class CartHandler {

    @Autowired
    IProductService productService;

    @RequestMapping("/addCart")
    public String addCart(String id, HttpSession session){
        //商品id为传入参数的商品加入购物车
        //购物车保存到session，购物车使用的数据据类型为map
        //map中商品为关键字，购买的数量为值
        //查询要放入购物车的商品信息
       Product product =  productService.findProductById(id);
       System.out.println("加入购物车的商品："+product);
       //先从session里获取购物车
        Map<Product,Integer> cart = (Map<Product,Integer>) session.getAttribute("cart");
       if (cart == null){
           //如果session中的cart不存在，则新建购物车
           //创建购物车
           cart = new HashMap<Product,Integer>();
       }
       //map.put方法是有返回值的，当key重复时，put方法返回值时原来value的值
        //这里的count就是原来商品的数量
        Integer count = cart.put(product,1);
      //如果count为nu11说明购物本中没有该商品。if不执行，购物车中商品数量就为1
        //如果count 不为nu11说明购物中心有原来就该商品，数量在原来基础上加1
        if (count != null){
            cart.put(product,count+1);
            //如果加1后大于商品库存，那么商品数量设置为商品库存总量
            if ((count+1)>product.getPnum()){
                cart.put(product,count);
            }
        }
        session.setAttribute("cart",cart);
        return "redirect:/client/cart.jsp";
    }
//改变商品数量
    @RequestMapping("/changeCart")
    public String changeCart(String id,Integer count,HttpSession session){
        //获取改变数量的商品信息
        Product product = productService.findProductById(id);
        //从session中获取购物车的原始数据
        Map<Product,Integer> cart = (Map<Product,Integer>) session.getAttribute("cart");
        //如果改变后商品的数量为0，从购物车商品改商品信息
        if (count == 0){
            cart.remove(product);
        }else{
            cart.put(product,count);
        }
        return "redirect:/client/cart.jsp";
    }
}
