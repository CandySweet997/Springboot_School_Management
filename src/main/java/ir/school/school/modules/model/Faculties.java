package ir.school.school.modules.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Faculties {
    @Id
    @GeneratedValue
    private int id;
    @Column(unique = true, nullable = false)
    private String name;
    @OneToMany
    private List<Professors> professors;
    @OneToMany
    private List<Students> students;
    @OneToMany
    private List<Courses> courses;

    public Faculties() {
    }

    public Faculties(String name, List<Professors> professors, List<Students> students, List<Courses> courses) {
        this.name = name;
        this.professors = professors;
        this.students = students;
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Professors> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professors> professors) {
        this.professors = professors;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
}


