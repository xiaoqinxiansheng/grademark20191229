package com.example.sl.demospringboot.service;

import com.example.sl.demospringboot.dao.UserMapper;
import com.example.sl.demospringboot.model.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo<User> findAll() {
//        PageInfo<User> page = PageHelper.startPage(1, 5).doSelectPage(() -> userMapper.selectAll());
        PageHelper.startPage(1,5);
        List<User> list = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo;
    }
}
