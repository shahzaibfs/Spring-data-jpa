
package Controller;


        import Entites.Student;
        import Entites.Teacher;
        import Repo.TeacherRepo;
        import Service.StudentService;
        import Service.TeacherService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private TeacherService teacherService ;

    @Autowired
    TeacherController(TeacherService t){
        this.teacherService = t;
    }


    @PostMapping("/")
    public String  createTeacher(@RequestBody Teacher t){


        return teacherService.createTeacher(t);

    }
}
