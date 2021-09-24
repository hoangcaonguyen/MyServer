package nguyen.myserver.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rq_id")
    private Integer rq_id;
    @Column(name = "rq_status")
    private String rq_status;
    @Column(name = "rq_type")
    private String rq_type;
    @Column(name = "work_type")
    private String work_type;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "position")
    private String position;
    @Column(name = "minimum_requirements")
    private String min_requirements;
    @Column(name = "work_time")
    private Integer work_time;
    @Column(name = "minimum_wage")
    private double minimum_wage;
    @Column(name = "job_description")
    private String jop_description;
}
