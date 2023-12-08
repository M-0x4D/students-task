package com.example.studentstask.Services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentstask.Models.Dto.StudentDto;
import com.example.studentstask.Models.Dto.TeacherDto;
import com.example.studentstask.Models.Entities.Student;
import com.example.studentstask.Models.Entities.Teacher;
import com.example.studentstask.Repositories.StudentRepo;
import com.example.studentstask.Repositories.TeacherRepo;

@Service
public class TeacherService {
    
    @Autowired
    public TeacherRepo teacherRepo;

    public TeacherDto create(Teacher teacher)
    {
        TeacherDto res = TeacherDto.fromEntityToDto(this.teacherRepo.save(teacher));
        return res;
    }

    public List<Teacher> getAll()
    {
        return this.teacherRepo.findAll();
    }

    public TeacherDto getTeacher(int id)
    {
        Optional<Teacher> teacher = this.teacherRepo.findById(id);
        // return student.orElse(null);
        if (teacher.isPresent()) {
            
            return TeacherDto.fromEntityToDto(teacher.get());
        }
        return null;
    }


    public TeacherDto update(Teacher teacher)
    {
        TeacherDto res = TeacherDto.fromEntityToDto(this.teacherRepo.save(teacher));
        return res;
    }

    
    public void delete(int id)
    {
        this.teacherRepo.deleteById(id);
    }
}
