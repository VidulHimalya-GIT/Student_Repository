package com.example.studentrecords.repository;
import com.example.studentrecords.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> students = new ArrayList<>();

    public List<Student> findAll(){
        return students;
    }

    public Student findById(int id){
        for(Student student: students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }
    public Student save(Student student){
        students.add(student);
        return student;
    }

    public boolean delete(int id){
        Student student = findById(id);

        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
}
