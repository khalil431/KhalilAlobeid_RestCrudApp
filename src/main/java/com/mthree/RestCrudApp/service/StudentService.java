package com.mthree.RestCrudApp.service;

import com.mthree.RestCrudApp.entity.Student;
import com.mthree.RestCrudApp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    /**
     * Constructor for StudentService class
     * @param studentRepository
     */
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * Obtains all students from the database
     * @return List of students in the database
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    /**
     * Searches a student with the id specified
     * @param id
     * @return The student with the specified id
     */
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    /**
     * Adds a student to the database
     * @param student
     * @return The student added to the database
     */
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
     * Deletes a student with the id specified
     * @param id
     */
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    /**
     * Updates a student with the specified id
     * @param id
     * @param updatedStudent
     * @return The student updated if update is successfully completed, null otherwise
     */
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
