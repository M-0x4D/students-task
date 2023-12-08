package com.example.studentstask.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentstask.Models.Dto.QuizDto;
import com.example.studentstask.Models.Dto.StudentDto;
import com.example.studentstask.Models.Entities.Quiz;
import com.example.studentstask.Models.Entities.Student;
import com.example.studentstask.Repositories.QuizRepo;
import com.example.studentstask.Repositories.StudentRepo;

@Service
public class QuizService {
    
    @Autowired
    public QuizRepo quizRepo;

    public QuizDto create(Quiz quiz)
    {
        QuizDto res = QuizDto.fromEntityToDto(this.quizRepo.save(quiz));
        return res;
    }

    public List<Quiz> getAll()
    {
        return this.quizRepo.findAll();
    }

    public QuizDto getQuiz(int id)
    {
        Optional<Quiz> quiz = this.quizRepo.findById(id);
        // return student.orElse(null);
        if (quiz.isPresent()) {
            
            return QuizDto.fromEntityToDto(quiz.get());
        }
        return null;
    }


    public QuizDto update(Quiz quiz)
    {
        QuizDto res = QuizDto.fromEntityToDto(this.quizRepo.save(quiz));
        return res;
    }

    
    public void delete(int id)
    {
        this.quizRepo.deleteById(id);
    }
}
