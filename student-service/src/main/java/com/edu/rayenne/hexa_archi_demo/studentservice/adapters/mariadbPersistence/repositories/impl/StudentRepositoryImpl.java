package com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.repositories.impl;

import com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.mapper.StudentMapper;
import com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.model.StudentEntity;
import com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.repositories.StudentDao;
import com.edu.rayenne.hexa_archi_demo.studentservice.domain.model.Student;
import com.edu.rayenne.hexa_archi_demo.studentservice.domain.persistentPort.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
@Slf4j
public class StudentRepositoryImpl implements StudentRepository {

    private final StudentDao studentDao;
    private final StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
        if(student !=null)
        {
            StudentEntity studentEntity=studentMapper.toStudentEntity(student);
            studentDao.save(studentEntity);
        }else{
            throw new NoSuchElementException("error element");
        }

    }


    @Override
    public List<Student> getAllStudent() {
        return studentDao.findAll()
                .stream()
                .map(student->studentMapper.toStudent(student))
                .toList();
    }
}
