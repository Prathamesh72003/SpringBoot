package com.restapi.restapi.Services;

import java.util.List;

import com.restapi.restapi.Entities.Students;

public interface ServiceInterface {
    public List<Students> getStudents();

    public Students getSpecifStudent(Long id);

    public Students addStudents(Students s);

    public Students updateStudent(Long id, Students s);
}
