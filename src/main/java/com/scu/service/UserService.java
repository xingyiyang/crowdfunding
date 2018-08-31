package com.scu.service;

import com.scu.domain.User;

/**
 * Created by xing on 2018/8/31.
 */
public interface UserService {
    public User userLogin(String userName, String userPwd);
}
