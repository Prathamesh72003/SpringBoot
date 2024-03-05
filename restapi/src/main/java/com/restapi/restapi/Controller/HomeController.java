package com.restapi.restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restapi.Entities.Students;
import com.restapi.restapi.Services.ServiceInterface;

@RestController
public class HomeController {

    @Autowired
    ServiceInterface serviceInterface;
    
    @GetMapping("/students")
    public List<Students> getStudents(){
        return this.serviceInterface.getStudents();
    }

    @GetMapping("/students/{id}")
    public Students getSpecifStudent(@PathVariable String id){
        return this.serviceInterface.getSpecifStudent(Long.parseLong(id));
    }

    @PostMapping("/students")
    public Students addStudent(@RequestBody Students s){
        return this.serviceInterface.addStudents(s);
    }

    @PutMapping("/updateStudent/{id}")
    public Students updateStudent(@PathVariable String id, @RequestBody Students s){
        return this.serviceInterface.updateStudent(Long.parseLong(id), s);
    }

}
