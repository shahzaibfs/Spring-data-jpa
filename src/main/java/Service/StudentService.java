package Service;

import Entites.Student;
import Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private StudentRepo studentRepo ;

    @Autowired
    StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo ;
    }

    public List<Student>  getAllStudents (){
        List<Student> l  = new ArrayList<>();
       List<Student> stList = (List<Student>) studentRepo.findAll();
        return  stList;
    }

    public String createStudent (Student s){
       studentRepo.save(s);
        return "Stduent added Succesfully";
    }
}
