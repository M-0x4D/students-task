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

import com.example.studentstask.Models.Dto.CourseDto;
import com.example.studentstask.Models.Dto.StudentDto;
import com.example.studentstask.Models.Entities.Course;
import com.example.studentstask.Models.Entities.Student;
import com.example.studentstask.Services.CourseService;
import com.example.studentstask.Services.StudentService;

@RestController
@RequestMapping("/course")
public class CourseController {
    
    @Autowired // [+] this annotation is for dependency injection
    private CourseService courseService ;


    @PostMapping("/create")
    private CourseDto create(@RequestBody Course course )
    {
        CourseDto res = this.courseService.create(course);
        return res;

    }

    @GetMapping("get-all")
    private List<Course> getAll()
    {
        return this.courseService.getAll();
    }

    @GetMapping("/get-course/{id}")
    private CourseDto getCourse(@PathVariable int id)
    {
        return this.courseService.getCourse(id);
    }


    @PutMapping("/update")
    private CourseDto update(@RequestBody Course course)
    {
        CourseDto res = this.courseService.update(course);
        return res;
    }

    
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable int id)
    {

        this.courseService.delete(id);
        return "course deleted successfully";
    }

}
