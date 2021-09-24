package nguyen.myserver.Repository;

import nguyen.myserver.Entity.Knowledge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgeRepository extends JpaRepository<Knowledge, Integer> {
}
