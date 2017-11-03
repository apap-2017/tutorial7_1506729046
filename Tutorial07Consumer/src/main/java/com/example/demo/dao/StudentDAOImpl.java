package com.example.demo.dao;

import com.example.demo.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentDAOImpl implements StudentDAO{

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public StudentModel selectStudent (String npm){
        StudentModel student = restTemplate.getForObject
                ("http://localhost:8080/rest/student/view/" + npm, StudentModel.class);
        return student;
    }

    @Override
    public List<StudentModel> selectAllStudents (){
        List<StudentModel> students = restTemplate.getForObject
                ("http://localhost:8080/rest/student/viewall", List.class);
        return students;
    }
}

