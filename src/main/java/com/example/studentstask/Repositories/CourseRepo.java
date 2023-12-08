package com.example.studentstask.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentstask.Models.Entities.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {
    
}
