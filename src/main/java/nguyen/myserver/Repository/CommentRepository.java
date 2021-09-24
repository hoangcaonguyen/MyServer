package nguyen.myserver.Repository;

import nguyen.myserver.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByEvaluate_type(String evaluate_type);
    @Query("select Comment from Student,Comment where (Comment .student_id= Student .id) in (select id    from  Student where Student.id := student.id)")
    List<Comment> getAllCommentByStudentID(Integer student_id);



}
