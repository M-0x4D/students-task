package com.example.studentstask.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentstask.Models.Dto.CourseDto;
import com.example.studentstask.Models.Dto.StudentDto;
import com.example.studentstask.Models.Entities.Course;
import com.example.studentstask.Models.Entities.Student;
import com.example.studentstask.Repositories.CourseRepo;
import com.example.studentstask.Repositories.StudentRepo;

@Service
public class CourseService {
    
    @Autowired
    public CourseRepo courseRepo;

    public CourseDto create(Course course)
    {
        CourseDto res = CourseDto.fromEntityToDto(this.courseRepo.save(course));
        return res;
    }

    public List<Course> getAll()
    {
        return this.courseRepo.findAll();
    }

    public CourseDto getCourse(int id)
    {
        Optional<Course> course = this.courseRepo.findById(id);
        // return student.orElse(null);
        if (course.isPresent()) {
            
            return CourseDto.fromEntityToDto(course.get());
        }
        return null;
    }


    public CourseDto update(Course course)
    {
        CourseDto res = CourseDto.fromEntityToDto(this.courseRepo.save(course));
        return res;
    }

    
    public void delete(int id)
    {
        this.courseRepo.deleteById(id);
    }

}
