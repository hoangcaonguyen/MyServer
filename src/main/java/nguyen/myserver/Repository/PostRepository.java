package nguyen.myserver.Repository;


import nguyen.myserver.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
    List<Post> findByRq_status(String rq_status);
    List<Post> findByRq_type(String rq_type);
    List<Post> findByWork_type(String work_type);
    List<Post> findByPosition(String position);
    @Query("select Post.rq_id from Post,Company where (Company.request_id = Post.rq_id) in (select company_name from  Company where company_name:= company_name)")
    List<Post> findPostByCompany_name(String company_name);
}
