package com.example.demo.web.rest;

import com.example.demo.domain.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeResource {

    @GetMapping("/")
     String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/{id}")
   String test(@PathVariable String id){
        return "id is a "+id;
    }

    @PostMapping("/")
    String employee(@RequestBody Employee employee){
        return employee.getName()+" "+employee.getRole();

    }
}
