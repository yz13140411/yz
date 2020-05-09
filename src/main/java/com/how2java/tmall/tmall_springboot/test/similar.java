package com.how2java.tmall.tmall_springboot.test;


import com.how2java.tmall.tmall_springboot.TmallSpringbootApplication;
import com.how2java.tmall.tmall_springboot.pojo.Order;
import com.how2java.tmall.tmall_springboot.pojo.OrderItem;
import com.how2java.tmall.tmall_springboot.pojo.User;
import com.how2java.tmall.tmall_springboot.service.OrderService;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TmallSpringbootApplication.class)

@WebAppConfiguration
public class similar {

    @Autowired
    OrderService orderService;
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }
    @Test
    public void test() {


        /*String s=null;
        User user =new User();
        user.setName("qq");
        user.setPassword("12");
        List<Order> orders = orderService.listByUserWithoutDelete(user);*/
        //orderService.removeOrderFromOrderItem(orders);
        /*for (Order order : orders) {
            for (OrderItem os : order.orderItems) {
                s = s + "\t" + os.product.getName();
            }
        }*/
        //System.out.println(s);
        /*List<User> u = userService.list();
        p_product=new String[u.size()];
        String p=null;
        {
            for (User us : u) {
                for (int i=0;i<u.size();i++)
                {
                    List<Order> ll = orderService.listByUserWithoutDelete(us);
                    if (ll.isEmpty())
                        ;
                    else {
                        for (Order order : orders) {
                            for (OrderItem os : order.orderItems) {
                                p=p + "\t" + os.product.getName();
                            }

                        }

                        p_product[i]=p;
                        p=null;
                    }
                }
            }

        }*/


    }
}
