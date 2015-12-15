package com.smart.web;

import com.smart.domain.User;
import com.smart.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by Administrator on 2015/12/15.
 */
@Controller
@RequestMapping(value="/admin")
public class LoginController {

    private static final Logger logger = Logger.getLogger(LoginController.class);
    @Autowired
    private UserService userSerivce;


    @RequestMapping(value="/login.html")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, HttpServletResponse response,LoginCommand loginCommand){

        if(logger.isDebugEnabled()){
            logger.debug("get login is executed");
        }

        logger.error("this is an error message ",new Exception("Testing"));
        boolean isValidUser = userSerivce.hasMatchUser(loginCommand.getUserName(),loginCommand.getPassword());

        if(!isValidUser){
            return new ModelAndView("login","error","用户名或密码错误");
        }else{
            User user = userSerivce.findUserByUserName(loginCommand.getUserName());
            user.setLastIp(request.getRemoteAddr());
            user.setLastVisit(new Date());
            request.getSession().setAttribute("user",user);
            return new ModelAndView("main");
        }
    }
}
