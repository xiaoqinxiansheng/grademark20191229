package com.example.sl.demospringboot.util;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MybatisConfig {

    @Bean
    public PageHelper pageHelper() {
        PageHelper.startPage(1, 5);
        return null;
    }
    }