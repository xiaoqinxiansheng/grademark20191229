package com.example.sl.demospringboot.service;

import com.example.sl.demospringboot.model.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    PageInfo<User> findAll();
}
