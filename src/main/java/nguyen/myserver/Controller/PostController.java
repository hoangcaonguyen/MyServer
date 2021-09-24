package nguyen.myserver.Controller;

import nguyen.myserver.Entity.Post;
import nguyen.myserver.Entity.User;
import nguyen.myserver.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {
    private PostService postService;
    @Autowired
    public PostController(PostService postService){this.postService = postService;}
    @GetMapping("/id")
    public Optional<Post> findPostById(@RequestParam Integer id){
        return postService.findPostByID(id);
    }
    @GetMapping
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
    @DeleteMapping(value = "/delete/{id}")
    public Post DeletePost(@PathVariable(name = "id") Integer id, Post post){
        postService.DeletePost(post);
        return post;
    }
    @PostMapping(value = "/addpost", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Post SavePost(@RequestBody Post post){
        postService.SavePost(post);
        return post;
    }
    @GetMapping("/rq_type")
    public List<Post> findPostByRqType(@RequestParam String rq_type){
        return postService.findByRqType(rq_type);
    }
    @GetMapping("/rq_status")
    public List<Post> findPostByRqStatus(@RequestParam String rq_status){
        return postService.findByRqStatus(rq_status);
    }
    @GetMapping("/work_type")
    public List<Post> findPostByWorkType(@RequestParam String work_type){
        return postService.findByWorkType(work_type);
    }
    @GetMapping("/position")
    public List<Post> findPostByPosition(@RequestParam String position){
        return postService.findByPosition(position);
    }
    @GetMapping("/company")
    public List<Post> findPostByCompany(@RequestParam String company_name){
        return postService.findByCompanyName(company_name);
    }
}
