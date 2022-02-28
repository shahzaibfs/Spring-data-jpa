package Entites;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
//table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @NotNull
    private String name ;
    @NotNull
    private String fatherName ;

    @OneToOne
    @JoinColumn(
            name = "teacherName"
    )
    private Teacher teacher  ;

    public Teacher getTeacher() {
        return teacher;
    }

    public Student(String name, String fatherName, Teacher teacher) {
        this.name = name;
        this.fatherName = fatherName;
        this.teacher = teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student() {
    }

    public Student(String name, String fatherName) {
        this.name= name;
        this.fatherName = fatherName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
