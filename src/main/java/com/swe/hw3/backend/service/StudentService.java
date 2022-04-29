package com.swe.hw3.backend.service;

import com.swe.hw3.backend.model.Students;
import com.swe.hw3.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    public Students addStudent(Students student) {
        return studentRepository.save(student);
    }
}
