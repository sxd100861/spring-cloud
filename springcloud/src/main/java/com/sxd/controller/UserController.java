package com.sxd.controller;


import com.sxd.pojo.TbUser;
import com.sxd.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user/list")
    public List<TbUser> list(ModelMap map) {
       List<TbUser> list= service.list();
       return list;
    }
}
