package com.smart.context;

import com.smart.domain.Car;
import com.smart.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by Administrator on 2015/12/15.
 */
@Configuration
public class Beans {

    @Bean(name="car")
    public Car buildCar(){
        Car car = new Car();
        car.setBrand("红旗AC72");
        car.setMaxSpeed("200");
        return car;
    }

    @Bean(name="user")
    public User buildUser(){
        User user = new User();
        user.setLastVisit(new Date());
        user.setLastIp("127.0.0.1");
        user.setUserName("wangwen");
        return user;
    }
}
