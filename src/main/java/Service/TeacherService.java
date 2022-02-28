package Service;

import Entites.Teacher;
import Repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo ;

    public String createTeacher(Teacher t){

        teacherRepo.save(t);
        return "ok created ";
    }
}
