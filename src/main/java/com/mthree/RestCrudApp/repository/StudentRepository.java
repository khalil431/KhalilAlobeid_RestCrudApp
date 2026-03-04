package com.mthree.RestCrudApp.repository;

import com.mthree.RestCrudApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
