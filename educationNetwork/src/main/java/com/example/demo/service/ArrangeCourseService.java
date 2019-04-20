package com.example.demo.service;

import com.example.demo.domain.ArrangeCourseTeacherEntity;

import java.util.List;
import java.util.Map;

public interface ArrangeCourseService {

    List<String> getAllCoursesBySpecialty(String specialty);

    Map<String, Object> getTeachersInfoTeachCourse(String courseName);

    int getCourseNumber(String courseName);

    String getAvailableClassroom(String course, String week, String detail);

    boolean updateClassroomOccupied(String week, String occpuied, String classNumber);

    boolean updateCourse(String week, String detail, String teacherName, String class_number, String course);
}
