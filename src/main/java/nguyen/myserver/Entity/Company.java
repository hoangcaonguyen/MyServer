package nguyen.myserver.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Integer company_id;
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "address")
    private String address;
    @Column(name = "field_id")
    private Integer field_id;
    @Column(name = "request_id")
    private Integer request_id;
}
