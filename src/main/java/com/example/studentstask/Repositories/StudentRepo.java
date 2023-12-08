package com.example.studentstask.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentstask.Models.Entities.Course;
import com.example.studentstask.Models.Entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    
}
