package ir.school.school.modules.model;

import javax.persistence.*;

@Entity
@Table
public class Courses {

    @Id
    @GeneratedValue
    private Long id ;

    @Column(unique = true,nullable = false)
    private String name;

    @Column(nullable = false)
    private int unit;
    @ManyToOne
    private Professors professors;

    public Courses() {
    }

    public Courses(String name, int unit, Professors professors) {
        this.name = name;
        this.unit = unit;
        this.professors = professors;
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

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public Professors getProfessors() {
        return professors;
    }

    public void setProfessors(Professors professors) {
        this.professors = professors;
    }
}
