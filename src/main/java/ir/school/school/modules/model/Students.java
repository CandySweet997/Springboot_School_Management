package ir.school.school.modules.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Students {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, name = "sid",nullable = false)
    private Long SID;//Student ID

    @Column(length = 15,nullable = false)
    private String name;

    @Column(length = 20 ,nullable = false)
    private String lastName;

   // private List<Course> courses;

    @Column(unique = true, name = "nid",length = 10,nullable = false)
    private String NID;//National ID



    @ManyToMany
    @JoinColumn(name = "students_courses")
    private List<Courses> courses;

    public Students() {
    }

    public Students(long id, Long SID, String name, String lastName, List<String> lessons, String NID) {
        this.SID = SID;
        this.name = name;
        this.lastName = lastName;
        this.NID = NID;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public Long getSID() {
        return SID;
    }

    public void setSID(Long SID) {
        this.SID = SID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getNID() {
        return NID;
    }





}
