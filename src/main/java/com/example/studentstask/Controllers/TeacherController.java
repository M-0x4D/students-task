package com.example.studentstask.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentstask.Services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/create")
    private String create()
    {
        return "create";

    }

    @GetMapping("get-all")
    private void getAll()
    {

    }

    @GetMapping("get-teacher/{id}")
    private void getTeacher(@PathVariable int id)
    {

    }


    @PutMapping("/update/{id}")
    private int update(@PathVariable int id)
    {
        return id;
    }

    
    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable int id)
    {

    }
    
}
