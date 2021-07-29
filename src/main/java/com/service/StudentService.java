package com.service;

import com.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> fetchStudents();
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudentByID(Integer id);
}
