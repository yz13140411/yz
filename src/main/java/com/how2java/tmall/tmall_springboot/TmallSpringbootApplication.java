package com.how2java.tmall.tmall_springboot;

import com.how2java.tmall.tmall_springboot.page.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TmallSpringbootApplication {
    static {
        PortUtil.checkPort(6379,"Redis 服务端",true);
    }

    public static void main(String[] args) {
        SpringApplication.run(TmallSpringbootApplication.class, args);
    }

}
