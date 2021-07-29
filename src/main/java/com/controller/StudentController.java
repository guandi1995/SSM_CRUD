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
 * @author Di Guan on 7/28/2021 8:35 PM
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    /**
     * 同步CRUD
     */

    /**
     * fetch students
     * @param model
     * @return
     */
    @RequestMapping("/fetchStudents")
    public String fetchStudents(Model model){
        List<Student> studentList = studentService.fetchStudents();
        model.addAttribute("studentList", studentList);
        return "/fetchStudents";
    }

    /**
     * insert student
     * @param student
     * @return
     */
    @RequestMapping("/insertStudent")
    public String insertStudent(Student student){
        System.out.println(student);
        studentService.insertStudent(student);
        return "forward:/student/fetchStudents";
    }

    /**
     * update student
     * @param map
     * @return
     */
    public String updateStudent(@RequestParam Map map){
        System.out.println(map);
        return "forward:/student/fetchStudents";
    }

    /**
     * delete student by id
     * @return
     */
    public String deleteStudentById(Integer id){
        System.out.println(id);
//        studentService.deleteStudentByID(id);
        return "forward:/student/fetchStudents";
    }


    /**
     * 异步CURD
     */

    @RequestMapping("/asyn/fetchStudents")
    @ResponseBody
    public List<Student> fetchStudentsAsyn(){
        return studentService.fetchStudents();
    }


}
