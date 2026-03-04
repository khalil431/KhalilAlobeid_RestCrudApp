package com.mthree.RestCrudApp.service;

import com.mthree.RestCrudApp.entity.Student;
import com.mthree.RestCrudApp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student prod = studentRepository.findById(id).orElse(null);
        if (prod != null) {
            prod.setName(updatedStudent.getName());
            prod.setFees(updatedStudent.getFees());
            return studentRepository.save(prod);
        }
        return null;
    }
}
