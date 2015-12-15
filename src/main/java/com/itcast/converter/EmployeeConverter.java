package com.itcast.converter;

import com.itcast.domain.Department;
import com.itcast.domain.Employee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/12/11.
 */
@Component
public class EmployeeConverter implements Converter<String,Employee> {


    public Employee convert(String s) {
        if(s!=null){
            String[] vals = s.split("_");
            if(vals!=null && vals.length==4){
                String lastName = vals[0];
                String email = vals[1];
                Integer gender = Integer.parseInt(vals[2]);
                Department department = new Department();
                department.setId(Integer.parseInt(vals[3]));

                Employee employee = new Employee(null,lastName,email,gender,department);
                return employee;
            }
        }
        return null;
    }
}
