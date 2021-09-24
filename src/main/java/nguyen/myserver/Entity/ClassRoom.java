package nguyen.myserver.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Classroom")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Class_id")
    private Integer class_id;
    @Column(name = "Student_id")
    private String student_id;
    @Column(name = "Scholastic_year")
    private int scholastic_year;
    @Column(name = "Class_name")
    private String class_name;
}
