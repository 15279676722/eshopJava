package com.example.demo.controller;

import com.example.demo.entity.CustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public CustomerVO login(@RequestBody CustomerVO vo){
        CustomerVO uservo = new CustomerVO();
          return uservo;
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public void logout(@RequestBody CustomerVO vo){

    }

}
