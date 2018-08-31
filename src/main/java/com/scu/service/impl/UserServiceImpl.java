package com.scu.service.impl;

import com.scu.dao.UserDao;
import com.scu.domain.User;
import com.scu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xing on 2018/8/31.
 */
@Service
public class UserServiceImpl implements UserService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public User userLogin(String userName, String userPwd) {
        return userDao.userLogin(userName, userPwd);
    }
}
