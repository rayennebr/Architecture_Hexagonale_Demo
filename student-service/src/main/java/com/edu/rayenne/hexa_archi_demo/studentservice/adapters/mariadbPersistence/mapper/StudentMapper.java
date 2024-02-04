package com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.mapper;

import com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.model.StudentEntity;
import com.edu.rayenne.hexa_archi_demo.studentservice.domain.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentEntity toStudentEntity(Student student)
    {
        return StudentEntity.builder()
                .studentIdentifier(student.studentIdentifier())
                .studentName(student.studentName())
                .studentLastName(student.studentLastName())
                .studentUid(student.studentUid())
                .build();
    }

    public Student toStudent(StudentEntity student)
    {
        return Student.builder()
                .studentIdentifier(student.getStudentIdentifier())
                .studentName(student.getStudentName())
                .studentLastName(student.getStudentLastName())
                .studentUid(student.getStudentUid())
                .build();
    }
}
