package nguyen.myserver.Service;

import nguyen.myserver.Entity.Post;
import nguyen.myserver.Repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPost(){return postRepository.findAll();}
    public void SavePost(Post post){postRepository.save(post);}
    public void DeletePost(Post post){postRepository.delete(post);}
    public Optional<Post> findPostByID(Integer id){
        return postRepository.findById(id);
    }
    public List<Post> findByRqStatus(String rq_status){return postRepository.findByRq_status(rq_status);}
    public List<Post> findByRqType(String rq_type){
        return postRepository.findByRq_type(rq_type);
    }
    public List<Post> findByWorkType(String work_type){return postRepository.findByWork_type(work_type);}
    public List<Post> findByPosition(String position){return postRepository.findByPosition(position);}
    public List<Post> findByCompanyName(String company_name){
        return postRepository.findPostByCompany_name(company_name);
    }
}
