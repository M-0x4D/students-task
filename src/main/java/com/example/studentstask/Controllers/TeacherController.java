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

import com.example.studentstask.Models.Dto.QuizDto;
import com.example.studentstask.Models.Dto.StudentDto;
import com.example.studentstask.Models.Dto.TeacherDto;
import com.example.studentstask.Models.Entities.Teacher;
import com.example.studentstask.Services.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/create")
    private TeacherDto create(@RequestBody Teacher teacher) {
        TeacherDto res = this.teacherService.create(teacher);
        return res;

    }

    @GetMapping("get-all")
    private List<Teacher> getAll() {
        return this.teacherService.getAll();
    }

    @GetMapping("get-teacher/{id}")
    private TeacherDto getTeacher(@PathVariable int id) {
        return this.teacherService.getTeacher(id);
    }

    @PutMapping("/update")
    private TeacherDto update(@RequestBody Teacher teacher) {
        TeacherDto res = this.teacherService.update(teacher);
        return res;
    }

    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable int id) {

        this.teacherService.delete(id);
        return "teacher deleted sucessfully";
    }

}
