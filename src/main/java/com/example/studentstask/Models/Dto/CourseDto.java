package com.example.studentstask.Models.Dto;

import com.example.studentstask.Models.Entities.Course;
import com.example.studentstask.Models.Entities.Student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
// @NoArgsConstructor

public class CourseDto {
    

    private int id;
    private String name;
    private float price;

    public static CourseDto fromEntityToDto(Course entity) {
        return CourseDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .price(entity.getPrice()).build();
    }

}
