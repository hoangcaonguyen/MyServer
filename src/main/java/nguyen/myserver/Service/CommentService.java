package nguyen.myserver.Service;


import nguyen.myserver.Entity.Comment;
import nguyen.myserver.Repository.CommentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAllComment(){return commentRepository.findAll();}
    public void SaveComment (Comment comment){commentRepository.save(comment);}
    public void DeleteComment (Comment comment){commentRepository.delete(comment);}
    public Optional<Comment> findCommentById(Integer cm_id){return commentRepository.findById(cm_id);}
    public List<Comment> findCommentByEvaluateType(String evaluate_type){return commentRepository.findByEvaluate_type(evaluate_type);}
    public List<Comment> findCommentByStudentId(Integer student_id){
        return commentRepository.getAllCommentByStudentID(student_id);
    }
@Transactional
    ham1{
        1 xoa user
            hgj
                    ghjgj
                    gjg




    }
//tra ve list la find all,k dung * duoc thi dat ten vd: student s => select s frome student s ..
    //sua ten bien k duowc _ , su dung transactional vao service
}
