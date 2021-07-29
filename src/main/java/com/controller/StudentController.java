package com.controller;

import com.pojo.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 同步CRUD
 * @author Di Guan on 7/28/2021 8:35 PM
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * fetch students
     */
    @RequestMapping("/fetchStudents")
    public String fetchStudents(Model model){
        List<Student> studentList = studentService.fetchStudents();
        model.addAttribute("studentList", studentList);
        return "/fetchStudents";
    }


    /**
     * insert student
     * 前台form表单自动映射pojo实体的属性
     */

    @RequestMapping("/insertStudent")
    public String insertStudent(Student student){
        System.out.println(student);
        studentService.insertStudent(student);
        return "redirect:/student/fetchStudents";
    }

    /**
     * update student
     * 首先fetchStudentByID
     * 再updateStudent
     */
    @RequestMapping("/fetchStudentByID")
    public String fetchStudentByID(Model model, Integer id){
        Student student = studentService.fetchStudentByID(id);
        model.addAttribute("student", student);
        return "/updateStudent";
    }
    @RequestMapping("/updateStudent")
    public String updateStudent(Student student){
        System.out.println(student);
        studentService.updateStudent(student);
        return "redirect:/student/fetchStudents";
    }

    /**
     * delete student by id
     * @return
     */
    @RequestMapping("/deleteStudentByID")
    public String deleteStudentById(Integer id){
        System.out.println(id);
        studentService.deleteStudentByID(id);
        return "redirect:/student/fetchStudents";
    }

}
