package Controller;


import Entites.Student;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService ;

    @Autowired
    StudentController(StudentService s){
        this.studentService = s;
    }

    @GetMapping("/")
    public List<Student> allStudents (){
        return studentService.getAllStudents();
    }
    @PostMapping("/")
    public String  createStudent(@RequestBody Student s){

        return studentService.createStudent(s);

    }
}
