package ir.school.school.modules.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Classroom {
    @Id
    @GeneratedValue
    private Long id ;

    private String name;
    @OneToMany
    private List<Students> students;

    public Classroom() {
    }

    public Classroom(String name, List<Students> students) {
        this.name = name;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
