package com.example.demo.dao;

import com.example.demo.model.CourseModel;

import java.util.List;

public interface CourseDAO {

    CourseModel selectCourse(String id);
    List<CourseModel> selectAllCourses ();
}
