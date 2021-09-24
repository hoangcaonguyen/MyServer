package nguyen.myserver.Repository;

import nguyen.myserver.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u from User u where u.username =: username")
    User findByUsername(String username);
    List<User> findByGmail(String gmail);
    List<User> findByPhone_number(String phone_number);
//    List<Map<String, Object>> results = employeeRepository.findAllWithMapResult();
//        return results.stream().map(result -> new CustomEmployeeRs(result))
//            .collect(Collectors.toList());

}
