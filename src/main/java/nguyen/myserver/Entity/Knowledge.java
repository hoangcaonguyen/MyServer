package nguyen.myserver.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Knowledge")
public class Knowledge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "knowledge_id")
    private Integer knowledge_id;
    @Column(name = "knowledge_name")
    private String knowledge_name;
}
