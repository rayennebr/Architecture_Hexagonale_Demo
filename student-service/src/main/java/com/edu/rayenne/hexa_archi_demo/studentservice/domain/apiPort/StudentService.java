package com.edu.rayenne.hexa_archi_demo.studentservice.domain.apiPort;

import com.edu.rayenne.hexa_archi_demo.studentservice.domain.model.Student;
import com.edu.rayenne.hexa_archi_demo.studentservice.domain.persistentPort.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    private final StudentRepository studentRepository;

    public void addStudent(Student student){
        if(student!=null)
        {
            log.info("student to add {}",student);
            studentRepository.addStudent(student);
        }else {
            throw new NoSuchElementException("student is mandatory");
        }
    }
    public List<Student> retrieveAllStudent()
    {
        return studentRepository.getAllStudent();
    }

}
