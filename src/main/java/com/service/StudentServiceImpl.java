package com.service;

import com.mapper.StudentMapper;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Di Guan on 7/28/2021 9:20 PM
 */

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> fetchStudents() {
        return studentMapper.fetchStudents();
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudentByID(Integer id) {
        return studentMapper.deleteStudentByID(id);
    }
}
