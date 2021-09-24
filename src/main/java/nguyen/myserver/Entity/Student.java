package nguyen.myserver.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "knowledge_id")
    private Integer knowledge_id;
    @Column(name = "status")
    private String status;
    @Column(name = "department")
    private String department;
}
