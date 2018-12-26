package com.gb.service;


import com.gb.entity.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<UserBean> findAllUser();
}
