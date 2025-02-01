package com.example.demo;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDataBase(EmployeeRepository employee) {
        System.out.println("start...");
        return args -> {
            employee.save(new Employee("James", "Smith"));
            employee.save(new Employee("hesam", "uy"));
        };
    }
}
