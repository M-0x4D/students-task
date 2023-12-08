package com.example.studentstask.Models.Dto;

import com.example.studentstask.Models.Entities.Student;
import com.example.studentstask.Models.Entities.Teacher;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
// @NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {
    
    private int id;
    private String name;
    private int age;
    private String major;

    public static TeacherDto fromEntityToDto(Teacher entity) {
        return TeacherDto.builder()
        .id(entity.getId())
        .name(entity.getName())
        .age(entity.getAge())
        .major(entity.getMajor()).build();
    }

}
