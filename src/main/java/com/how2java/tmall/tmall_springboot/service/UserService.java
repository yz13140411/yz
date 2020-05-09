package com.how2java.tmall.tmall_springboot.service;

import com.how2java.tmall.tmall_springboot.dao.UserDAO;
import com.how2java.tmall.tmall_springboot.page.Page4Navigator;
import com.how2java.tmall.tmall_springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames="users")
public class UserService {

    @Autowired
    UserDAO userDAO;

    public List<User> list()
    {
        return userDAO.findAll();
    }

    public Page4Navigator<User> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA =userDAO.findAll(pageable);
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public boolean isExist(String name) {
        User user = getByName(name);
        return null!=user;
    }
    @Cacheable(key="'users-one-name-'+ #p0")
    public User getByName(String name) {
        return userDAO.findByName(name);
    }
    @Cacheable(key="'users-one-name-'+ #p0 +'-password-'+ #p1")
    public User get(String name, String password) {
        return userDAO.getByNameAndPassword(name,password);
    }
    @CacheEvict(allEntries=true)
    public void add(User user) {
        userDAO.save(user);
    }

}