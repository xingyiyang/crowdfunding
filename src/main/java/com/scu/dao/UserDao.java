package com.scu.dao;

import com.scu.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by xing on 2018/8/31.
 */
public interface UserDao {
    public User userLogin(@Param("userName") String userName, @Param("userPwd") String userPwd);
}
