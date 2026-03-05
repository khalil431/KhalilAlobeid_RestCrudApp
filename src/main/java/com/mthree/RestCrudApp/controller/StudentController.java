package com.mthree.RestCrudApp.controller;

import com.mthree.RestCrudApp.entity.Student;
import com.mthree.RestCrudApp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    /**
     * Constructor for StudentController class
     * @param studentService
     */
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Calls on the service layer to add a new student to the database
     * @param student
     * @return The student added to the database
     */
    @PostMapping
    public Student addNewStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    /**
     * Calls on the service layer to get all students from the database
     * @return The list of students from the database
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    /**
     * Calls on the service layer to obtain the student
     * with the specified id from the database
     * @param id
     * @return The student with the specified id
     */
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    /**
     * Calls on the service layer to delete a student with the specified id
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    /**
     * Calls on the service layer to update a student with the specified id
     * @param id
     * @param updatedStudent
     * @return The updated student if update is successfully completed, null otherwise
     */
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }
}
