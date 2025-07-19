package com.spring.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;  // Change this import
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_user")
public class User {

    @Id
    private String name;
    private String password;
}
