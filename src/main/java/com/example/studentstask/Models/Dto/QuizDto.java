package com.example.studentstask.Models.Dto;

import com.example.studentstask.Models.Entities.Quiz;
import com.example.studentstask.Models.Entities.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
// @NoArgsConstructor
@AllArgsConstructor
public class QuizDto {
    
    private int id;
    private String course_name;

    public static QuizDto fromEntityToDto(Quiz entity) {
        return QuizDto.builder()
        .id(entity.getId())
        .course_name(entity.getCourse_name()).build();
    }

}
