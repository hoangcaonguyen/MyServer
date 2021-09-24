package nguyen.myserver.Repository;

import nguyen.myserver.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByDepartment(String department);
}
