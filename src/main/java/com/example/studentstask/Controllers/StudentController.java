package com.example.studentstask.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentstask.Models.Dto.StudentDto;
import com.example.studentstask.Models.Entities.Student;
import com.example.studentstask.Services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
 
    @Autowired
    public StudentService studentService;

    @PostMapping("/create")
    private StudentDto create(@RequestBody Student student )
    {
        StudentDto res = this.studentService.create(student);
        return res;

    }

    @GetMapping("get-all")
    private List<Student> getAll()
    {
        return this.studentService.getAll();
    }

    @GetMapping("get-student/{id}")
    private StudentDto getStudent(@PathVariable int id)
    {
        return this.studentService.getStudent(id);

    }


    @PutMapping("/update")
    private StudentDto update(@RequestBody Student student)
    {
        StudentDto res = this.studentService.update(student);
        return res;
    }

    
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable int id)
    {
        this.studentService.delete(id);
        return "student deleted successfully";
    }
}
