package com.kgc.controller;

import com.kgc.pojo.Person;
import com.kgc.pojo.Student;
import com.kgc.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Student student;

    @Autowired
    private Teacher teacher;

    @RequestMapping("/showteacher")
    public Teacher getTeacher(){
        return teacher;
    }

    @RequestMapping("/showstu")
    public Student getStu(){
        return student;
    }

    @RequestMapping("/showperson")
    public Person getPerson(){
        //Person person=new Person(1,"张三1");
        Person person1=new Person();
        person1.setId(2);
        person1.setName("李四");
        return person1;
    }


    @RequestMapping("/show")
    public String hello(){
        return "Hello Spring Boot";
    }


}
