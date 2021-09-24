package nguyen.myserver.Service;

import nguyen.myserver.Entity.User;
import nguyen.myserver.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findAllById(Integer id){return userRepository.findById(id);}
    public List<User> getAllUser(){return userRepository.findAll();}
    public void SaveData (User user){userRepository.save(user);}
    public void DeleteData (User user){userRepository.delete(user);}
    public List<User> findByUserName(String username){return userRepository.findByUsername(username);}
    public List<User> findByPhoneNumber(String phone_number){return userRepository.findByPhone_number(phone_number);}
    public List<User> findByGmail(String gmail){return userRepository.findByGmail(gmail);}
}
