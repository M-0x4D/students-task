package com.example.studentstask.Models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "courses")
@Data // for getter and setter
@Entity
@NoArgsConstructor
// @AllArgsConstructor
public class Course {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private float price;


}
