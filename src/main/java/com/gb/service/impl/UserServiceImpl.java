package com.gb.service.impl;


import com.gb.mapper.UserMapper;
import com.gb.entity.UserBean;
import com.gb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<UserBean> findAllUser() {
        return userMapper.findAllUser();
    }

}
