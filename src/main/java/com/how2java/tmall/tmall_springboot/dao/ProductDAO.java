package com.how2java.tmall.tmall_springboot.dao;

import com.how2java.tmall.tmall_springboot.pojo.Category;
import com.how2java.tmall.tmall_springboot.pojo.Order;
import com.how2java.tmall.tmall_springboot.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Integer> {
    Page<Product> findByCategory(Category category, Pageable pageable);
    List<Product> findByCategoryOrderById(Category category);
    List<Product> findByNameLike(String keyword, Pageable pageable);
    List<Product> findById(int keyword);

    //List<Product> findByOrder(Order order);
}
