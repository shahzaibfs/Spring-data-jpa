package Entites;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher {

    @Id
    private String name ;

    @OneToOne(
            mappedBy = "teacher"
    )
    private Student student ;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }




    public Teacher() {

    }

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
