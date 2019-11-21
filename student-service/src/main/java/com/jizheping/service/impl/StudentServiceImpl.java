package com.jizheping.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jizheping.mapper.StudentMapper;
import com.jizheping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public JSONObject getStudentList() {
        String json = studentMapper.getStudentList().toString();

        JSONObject obj = JSONObject.parseObject(json);

        return obj;
    }
}
