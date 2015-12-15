package com.itcast.controller;

import com.itcast.domain.Employee;
import com.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Administrator on 2015/11/25.
 */

@Controller
@SessionAttributes(value = {"user"},types = {String.class})
public class HelloController {

    @RequestMapping("/testModelModelAttribute")
    public String testModelModelAttribute(@RequestParam("employee") @Valid  Employee employee, BindingResult result,Map<String,Object> map){
        if(result.getErrorCount()>0){
            System.out.println("error");
            for(FieldError error:result.getFieldErrors()){
                System.out.println(error.getField()+"==="+error.getDefaultMessage());
            }
            //error
            map.put("Emloyee", employee);
            return "input";
        }
        System.out.println("save:"+employee);
        return null;
    }


    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("testRedirect");
        return "redirect:index.jsp";
    }


    @RequestMapping("/testView")
    public String testView(){
        System.out.println("test view");
        return "helloView";
    }

    /**
     * 带有ModelAttribute的方法会在每个目标方法呗调用前调用
     * @param id
     * @param map
     */
    @ModelAttribute
    public void getUser(@RequestParam(value="id",required = false) Integer id,Map<String,Object> map){
        if(id!=null){
            System.out.println("从数据库中获取对象");
            User user = new User(1,"tom","3232323","tom@183.com",43);
            map.put("user",user);
        }
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Map<String,Object> map){
        User user = new User(1,"tom","12345","tom@163.com",12);
        map.put("user",user);
        map.put("school","yangzhou");
        return "success";

    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "success";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setDisallowedFields("lastName");
    }

}
