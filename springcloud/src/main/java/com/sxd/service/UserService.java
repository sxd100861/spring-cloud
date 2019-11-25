package com.sxd.service;

import com.sxd.mapper.UserMapper;
import com.sxd.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;
    public List<TbUser> list(){
        return mapper.selectAll();
    }
}
