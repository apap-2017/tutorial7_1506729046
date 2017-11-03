package com.example.demo.rest;

import com.example.demo.model.CourseModel;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class CourseRestController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/course/view/{id}")
    public CourseModel view (@PathVariable(value="id") String id) {
        CourseModel course = studentService.selectCourse(id);
        return course;
    }

    @RequestMapping("/course/viewall")
    public List<CourseModel> viewAll (){
        List<CourseModel> courses = studentService.selectAllCourses();
        return courses;
    }
}
