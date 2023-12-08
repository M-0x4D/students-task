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
import com.example.studentstask.Models.Dto.QuizDto;
import com.example.studentstask.Models.Entities.Course;
import com.example.studentstask.Models.Entities.Quiz;
import com.example.studentstask.Services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    
    @Autowired
    private QuizService quizService ;

    @PostMapping("/create")
    private QuizDto create(@RequestBody Quiz quiz)
    {
        QuizDto res = this.quizService.create(quiz);
        return res;

    }

    @GetMapping("get-all")
    private List<Quiz> getAll()
    {
        return this.quizService.getAll();
    }

    @GetMapping("get-quiz/{id}")
    private QuizDto getQuiz(@PathVariable int id)
    {
        return this.quizService.getQuiz(id);
    }


    @PutMapping("/update")
    private QuizDto update(@RequestBody Quiz quiz)
    {
        QuizDto res = this.quizService.update(quiz);
        return res;
    }

    
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable int id)
    {
        this.quizService.delete(id);
        return "quiz deleted successfully";
    }

}
