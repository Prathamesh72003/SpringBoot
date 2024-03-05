package com.restapi.restapi.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.restapi.Entities.Students;

@Service
public class ServiceClass implements ServiceInterface {

    List<Students> students;

    public ServiceClass() {

        students = new ArrayList<>();
        students.add(new Students(12220016, "Prathamesh", "CE"));
        students.add(new Students(12220014, "Ajinkya", "CE"));
        students.add(new Students(12220017, "Gourav", "CE"));

    }


    @Override
    public List<Students> getStudents() {
        return students;
    }


    @Override
    public Students getSpecifStudent(Long id) {
        Students student = null;
        for(Students s : students){
            if(s.getId() == id){
                student = s;
            }
        }

        return student;
    }

    @Override
    public Students addStudents(Students s) {
        students.add(s);
        return s;
    }


    @Override
    public Students updateStudent(Long id, Students s) {
        Students resstud = null;
        for(Students st : students){
            if(st.getId() == id){
                st.setName(s.getName() != null ? s.getName() : st.getName());
                st.setId(s.getId() != 0 ? s.getId() : st.getId());
                st.setBranch(s.getBranch() != null ? s.getBranch() : st.getBranch());
                resstud = st;
            }
        }

        return resstud;
    }
    
}
