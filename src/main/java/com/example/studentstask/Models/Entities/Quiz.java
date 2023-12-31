package com.example.studentstask.Models.Entities;

import jakarta.persistence.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "quizes")
@Data // for getter and setter
@Entity
@NoArgsConstructor
// @AllArgsConstructor
public class Quiz {
    
    @Id
    @GeneratedValue
    private int id;
    private String course_name;
    

}
