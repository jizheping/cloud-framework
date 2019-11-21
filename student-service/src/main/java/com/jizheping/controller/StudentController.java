package com.jizheping.controller;

import com.alibaba.fastjson.JSONObject;
import com.jizheping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudentList")
    public JSONObject getStudent(){
        return studentService.getStudentList();
    }
}
