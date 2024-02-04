package com.edu.rayenne.hexa_archi_demo.studentservice.domain.persistentPort;

import com.edu.rayenne.hexa_archi_demo.studentservice.domain.model.Student;

import java.util.List;

public interface StudentRepository {

    void addStudent(Student student);
    List<Student>getAllStudent();
}
