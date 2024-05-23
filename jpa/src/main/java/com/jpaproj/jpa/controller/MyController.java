package com.jpaproj.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jpaproj.jpa.dao.DataRep;
import com.jpaproj.jpa.model.Student;

@Controller
public class MyController {
    
    @Autowired
    DataRep dataRep;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        dataRep.save(student);
        return "home";
    }

    @RequestMapping("/getStudent")
    public ModelAndView getStudent(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("showdata");
        Student student = dataRep.findById(id).orElse(new Student());
        modelAndView.addObject("student", student);
        return modelAndView;
    }

}
