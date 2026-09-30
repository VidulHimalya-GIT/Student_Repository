package com.example.studentrecords.service;

import com.example.studentrecords.model.Student;
import com.example.studentrecords.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepository studentRepository;
    
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    
    public Student getStudentById(int id){
        return studentRepository.findById(id);
    }
    
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    
    public boolean deleteStudent(int id){
        return studentRepository.delete(id);
    }
}
