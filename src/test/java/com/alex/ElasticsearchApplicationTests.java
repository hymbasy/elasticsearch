package com.alex;

import com.alex.model.Employee;
import com.alex.service.EmployeeService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void add() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setFirstName("xuxu");
        employee.setLastName("zh");
        employee.setAge(null);
        employee.setAbout("i am in peking");
        employeeService.save(employee);
    }

    @Test
    public void find(){
        Employee employee = employeeService.findById("1");
        System.out.println(JSON.toJSONString(employee));
    }

    @Test
    public void update(){
        Employee employee = employeeService.findById("1");
        employee.setAbout("这个是es搜索测试");
        employee.setFirstName("张");
        employee.setLastName("学友");
        employeeService.save(employee);
    }

}
