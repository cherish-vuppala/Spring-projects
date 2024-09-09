package com.Cherish.EmployeeManagementSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false, updatable = false)
        Long id;
        String name;
        String jobTitle;
        String phone;
        String imageUrl;
        @Column(nullable = false, updatable = false)
        String employeeCode;

}
