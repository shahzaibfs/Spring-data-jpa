package Entites;

import javax.persistence.*;

@Entity
//table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    private String name ;
    private String fatherName ;

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
