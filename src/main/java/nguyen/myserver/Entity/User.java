package nguyen.myserver.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "role")
    private String role;
    @Column(name = "gmail")
    private String gmail;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "student_id")
    private Integer student_id;
    @Column(name = "company_id")
    private Integer company_id;
}
