package com.how2java.tmall.tmall_springboot.dao;

import com.how2java.tmall.tmall_springboot.pojo.Category;
import com.how2java.tmall.tmall_springboot.pojo.Order;
import com.how2java.tmall.tmall_springboot.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Integer> {
    Page<Product> findByCategory(Category category, Pageable pageable);
    List<Product> findByCategoryOrderById(Category category);
    List<Product> findByNameLike(String keyword, Pageable pageable);
    List<Product> findById(int keyword);
    @Query(value = "select * from product order by rand() limit 5" ,nativeQuery = true)
    List<Product> findRandomProduct();
    //List<Product> findByOrder(Order order);
}
