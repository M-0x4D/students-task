package com.example.studentstask.Models.Dto;

import com.example.studentstask.Models.Entities.Student;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {

    private int id;
    private String name;
    private int age;
    private float grade;

    public static StudentDto fromEntityToDto(Student entity) {
        return StudentDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .grade(entity.getGrade()).build();
    }

}
