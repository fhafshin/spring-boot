package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Entity
public class Employee {
@Id
@GeneratedValue
    private long id;
    private String name;
    private String role;

    public static final Logger logger= LogManager.getLogger(Employee.class);

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        logger.trace("create employee ....");
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
