package com.edu.rayenne.hexa_archi_demo.studentservice.adapters.restApi;

import com.edu.rayenne.hexa_archi_demo.studentservice.adapters.mariadbPersistence.repositories.impl.StudentRepositoryImpl;
import com.edu.rayenne.hexa_archi_demo.studentservice.domain.apiPort.StudentService;
import com.edu.rayenne.hexa_archi_demo.studentservice.domain.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@CrossOrigin("*")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/")
    public String addStudent(@RequestBody Student student)
    {
        try{
            studentService.addStudent(student);
            return "success";
        }catch (Exception e)
        {
            return e.getCause().getMessage();
        }
    }

    @GetMapping("/")
    public List<Student> getAllStudent()
    {
        return studentService.retrieveAllStudent();
    }
}
