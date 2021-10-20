package ir.school.school.modules.model;

import javax.persistence.*;

@Entity
@Table
public class Professors {
    @Id
    @GeneratedValue
    private Long id;

    @Column( nullable = false)
    private String name;

    @Column( nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false, name ="pid")
    private Long PID ;//Personnel ID

    @Column(unique = true,nullable = false, name = "nid")
    private String NID;//National ID

    public Professors() {
    }

    public Professors(String name, String lastName, Long PID, String NID) {
        this.name = name;
        this.lastName = lastName;
        this.PID = PID;
        this.NID = NID;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPID() {
        return PID;
    }

    public void setPID(Long PID) {
        this.PID = PID;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    @Override
    public String toString() {
        return "Professors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PID=" + PID +
                ", NID=" + NID +
                '}';
    }
}
