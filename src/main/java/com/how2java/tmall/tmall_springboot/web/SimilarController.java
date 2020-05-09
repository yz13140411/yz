/*
package com.how2java.tmall.tmall_springboot.web;

import com.how2java.tmall.tmall_springboot.pojo.Order;
import com.how2java.tmall.tmall_springboot.pojo.OrderItem;
import com.how2java.tmall.tmall_springboot.pojo.Product;
import com.how2java.tmall.tmall_springboot.pojo.User;
import com.how2java.tmall.tmall_springboot.service.OrderService;
import com.how2java.tmall.tmall_springboot.service.ProductService;
import com.how2java.tmall.tmall_springboot.service.UserService;
import com.how2java.tmall.tmall_springboot.similar.recommend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class SimilarController {
    String []last=null;
String pproduct[]=null;
 String s;
 String p;
 String []p_product=null;
    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;
    @GetMapping("/similar")
    public Product recommend(@RequestBody User userParam, HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Order> orders = orderService.listByUserWithoutDelete(user);
        orderService.removeOrderFromOrderItem(orders);
        for (Order order : orders) {
            for (OrderItem os : order.orderItems) {
                s = s + "\t" + os.product.getName();
            }
        }
        List<User> u = userService.list();
        p_product = new String[u.size()];
        {
            for (User us : u) {
                for (int i = 0; i < u.size(); i++) {
                    List<Order> ll = orderService.listByUserWithoutDelete(us);
                    if (ll.isEmpty())
                        ;
                    else {
                        for (Order order : orders) {
                            for (OrderItem os : order.orderItems) {
                                p = p + "\t" + os.product.getName();
                            }

                        }

                        p_product[i] = p;
                        p = null;
                    }
                }
            }

        }
        recommend rec = new recommend();
        rec.fit(p_product);
        double[] doubles = rec.recommendFun(s);

        //取出最大关系的下标
        double max = 0;    //关系
        int maxIndex = 0;   //下标
        for (int i = 0; i < doubles.length; i++) {

            if (doubles[i] > max) {
                max = doubles[i];
                maxIndex = i;
            }
        }
        String lat = (String) Arrays.asList(rec.getProduct().toArray()).get(maxIndex);
        ;
        //return productService.product(lat).get(0);

    }
}
*/
