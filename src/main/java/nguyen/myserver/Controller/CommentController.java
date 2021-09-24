package nguyen.myserver.Controller;

import nguyen.myserver.Entity.Comment;
import nguyen.myserver.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private CommentService commentService;
    @Autowired
    public CommentController(CommentService commentService){this.commentService = commentService;};
    @GetMapping("/id")
    public Optional<Comment> findCommentById(@RequestParam Integer cm_id){
        return commentService.findCommentById(cm_id);
    }
    @GetMapping
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }
    @DeleteMapping(value = "/delete/{id}")
    public Comment DeleteComment(@PathVariable(name = "id") Integer cm_id, Comment comment){
        commentService.DeleteComment(comment);
        return comment;
    }
    @PostMapping(value = "/add_comment", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Comment SaveComment(@RequestBody Comment comment){
        commentService.SaveComment(comment);
        return comment;
    }
    @GetMapping("/comment/evaluate")
    public List<Comment> findCommentByEvaluateType(@RequestParam String evaluate_type){
        return commentService.findCommentByEvaluateType(evaluate_type);
    }
    @GetMapping("/comment/student")
    public List<Comment> findCommentByStudentId(@RequestParam Integer student_id){
        return commentService.findCommentByStudentId(student_id);
    }
}
