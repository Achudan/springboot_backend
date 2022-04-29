package com.swe.hw3.backend.resource;

import com.swe.hw3.backend.model.Students;
import com.swe.hw3.backend.repository.StudentRepository;
import com.swe.hw3.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/students")
public class StudentResource {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/getAll")
    public List<Students> getAll(){
        return studentService.findAll();
    }

    @PostMapping("/addStudent")
    public Students addStudent(@RequestBody Students student) {

        return studentService.addStudent(student);
    }
}
