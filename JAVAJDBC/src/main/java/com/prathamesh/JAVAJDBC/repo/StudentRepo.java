package com.prathamesh.JAVAJDBC.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.prathamesh.JAVAJDBC.model.Student;

@Repository
public class StudentRepo {
    
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate(){
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveStudent(Student student){

        String insertQuery = "insert into students(id, name, department) values(?,?,?)";

        int rows = jdbcTemplate.update(insertQuery, student.getId(), student.getName(), student.getDepartment());

        System.out.println(rows+" row/s affected.");
    }

    public List<Student> findAll(){

        String getQuery = "select * from students";

        RowMapper<Student> mapper = new RowMapper<Student>() {

            @Override
            @Nullable
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setDepartment(rs.getString(3));

                return s;
            }
            
        };

        List<Student> res = jdbcTemplate.query(getQuery, mapper);

        return res;
    }

}
