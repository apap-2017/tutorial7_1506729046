package com.example.demo.service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.CourseModel;
import com.example.demo.model.StudentModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public StudentModel selectStudent (String npm){
        log.info("REST - select student with npm {}", npm);
        return studentDAO.selectStudent(npm);
    }

    @Override
    public List<StudentModel> selectAllStudents(){
        log.info("REST - select all students");
        List<StudentModel> students = studentDAO.selectAllStudents();
        return students;
    }

    @Override
    public void addStudent (StudentModel student){}

    @Override
    public void deleteStudent (String npm) {}

    @Override
    public void updateStudent(StudentModel student) {}

    @Override
    public CourseModel selectCourse(String id) {
        return null;
    }

    @Override
    public void addCourse(String npm, String idCourse) {}
}
