package com.example.studentstask.Models.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "courses")
@Data
@Entity
@Builder
@NoArgsConstructor
// @AllArgsConstructor
public class Course {
    
}