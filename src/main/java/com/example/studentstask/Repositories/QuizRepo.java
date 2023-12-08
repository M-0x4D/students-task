package com.example.studentstask.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentstask.Models.Entities.Course;
import com.example.studentstask.Models.Entities.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
    
}
