package com.gb.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gb.mapper.UserMapper;
import com.gb.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下，可去除
public class UserController {

    @Resource
    private UserService userService;

    private static Logger logger = LogManager.getLogger("UserController");

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getAllUser", method= RequestMethod.GET)
    @ResponseBody
    public String getUserList() {
        return userMapper.findAllUser().get(0).getUsername();
    }

    @RequestMapping(value = "/getTestInfo", method= RequestMethod.GET)
    @ResponseBody
    public String getTestInfo() {
        return "test";
    }
}