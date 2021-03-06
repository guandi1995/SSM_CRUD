package com.mapper;

import com.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    List<Student> fetchStudents();
    int insertStudent(Student student);
    int deleteStudentByID(Integer id);
    List<Student> fetchStudentByID(Integer id);
    int updateStudent(Student student);
}
