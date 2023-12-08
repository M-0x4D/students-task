package com.example.studentstask.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.studentstask.Models.Dto.StudentDto;
import com.example.studentstask.Models.Entities.Student;
import com.example.studentstask.Repositories.StudentRepo;

@Service
public class StudentService {

    @Autowired
    public StudentRepo studentRepo;

    public StudentDto create(Student student)
    {
        StudentDto res = StudentDto.fromEntityToDto(this.studentRepo.save(student));
        return res;
    }

    public List<Student> getAll()
    {
        return this.studentRepo.findAll();
    }

    public StudentDto getStudent(int id)
    {
        Optional<Student> student = this.studentRepo.findById(id);
        // return student.orElse(null);
        if (student.isPresent()) {
            
            return StudentDto.fromEntityToDto(student.get());
        }
        return null;
    }


    public StudentDto update(Student student)
    {
        StudentDto res = StudentDto.fromEntityToDto(this.studentRepo.save(student));
        return res;
    }

    
    public void delete(int id)
    {
        this.studentRepo.deleteById(id);
    }
    
}
