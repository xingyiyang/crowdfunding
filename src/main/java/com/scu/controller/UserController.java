package com.scu.controller;

import com.scu.domain.User;
import com.scu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by xing on 2018/8/31.
 */
@Controller
@RequestMapping("user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView userLogin(User user){

        String userName = user.getUserName();
        String userPwd = user.getUserPwd();
        if(userName == null || "".equals(userName)){
            return new ModelAndView("login","errormessage","用户名不能为空");
        }else{
            if(userPwd==null || "".equals(userPwd)){
                return new ModelAndView("login","errormessage","密码不能为空");
            }else{
                if(userService.userLogin(userName,userPwd) != null){
                    return new ModelAndView("test","user",user);
                }else{
                    return new ModelAndView("login","errormessage","用户名或密码错误");
                }
            }
        }
    }
}
