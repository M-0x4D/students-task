package com.example.studentstask.Models.Entities;

import com.example.studentstask.Models.Dto.StudentDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "students")
@Data // for getter and setter
@Entity
@NoArgsConstructor
// @AllArgsConstructor
public class Student {
 
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private float grade;

}
