package nguyen.myserver.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cm_id")
    private Integer cm_id;
    @Column(name = "company_id")
    private Integer company_id;
    @Column(name = "student_id")
    private Integer student_id;
    @Column(name = "evaluate_type")
    private String evaluate_type;
    @Column(name = "evaluate")
    private String eva;
}
