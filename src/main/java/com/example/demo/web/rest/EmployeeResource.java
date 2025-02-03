package com.example.demo.web.rest;

import com.example.demo.config.Config;
import com.example.demo.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeResource {


    private final Config config;

    @Autowired
    public EmployeeResource(Config config) {
        this.config = config;
    }
    @Value("${app.name}")
   private String appName;


    @GetMapping("/")
    String helloWorld() {

        return "Hello World" + " " + config.getName();
    }

    @GetMapping("/{id}")
    String test(@PathVariable String id) {
        return "id is a " + id;
    }

    @PostMapping("/")
    String employee(@RequestBody Employee employee) {
        return employee.getName() + " " + employee.getRole();

    }
}
