package ir.school.school.modules.model;

import javax.persistence.*;

@Entity
@Table
public class Scores {
    @Id
    @GeneratedValue
    private Long id;

    private double score;
    @ManyToOne

    private Courses courses;
    @ManyToOne
    private Students students;

    public Scores() {
    }

    public Scores(double score, Courses courses, Students students) {
        this.score = score;
        this.courses = courses;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
