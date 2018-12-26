package com.gb.mapper;

import com.gb.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper{

    List<UserBean> findAllUser();

}

