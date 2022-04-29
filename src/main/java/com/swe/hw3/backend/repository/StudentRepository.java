package com.swe.hw3.backend.repository;

import com.swe.hw3.backend.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students, String> {

}
