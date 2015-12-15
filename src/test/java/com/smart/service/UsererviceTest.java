package com.smart.service;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Administrator on 2015/12/15.
 */
@ContextConfiguration(locations={"/applicationContext.xml"})
public class UsererviceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserService userSerivce;

    @Test
    public void hasMatchUser(){
        boolean b1 = userSerivce.hasMatchUser("admin","123456");
        boolean b2 = userSerivce.hasMatchUser("admin","1111");

        assertTrue(b1);
        assertTrue(!b2);
    }

    @Test
    public void findUserByUserName(){
        User user = userSerivce.findUserByUserName("admin");
        assertEquals(user.getUserName(),"admin");
    }
}
