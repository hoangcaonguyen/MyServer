package nguyen.myserver.Repository;


import nguyen.myserver.Entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FieldRepository extends JpaRepository<Field, Integer> {
}
