package com.smart.context;

import com.smart.domain.Car;
import com.smart.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2015/12/15.
 */
public class AnnotationApplicationContext {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Car car = ctx.getBean("car",Car.class);
        System.out.println(car.getBrand());

        User user = ctx.getBean("user",User.class);
        System.out.println(user.getUserName());
    }
}
