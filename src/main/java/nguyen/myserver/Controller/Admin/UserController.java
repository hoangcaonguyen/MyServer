package nguyen.myserver.Controller.Admin;

import nguyen.myserver.Entity.User;
import nguyen.myserver.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService){this.userService = userService;}
    @GetMapping("/id")
    public Optional<User> findAllById(@RequestParam Integer id){
        return userService.findAllById(id);
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @DeleteMapping(value = "/delete/{id}")
    public User DeleteData(@PathVariable(name = "id") Integer id, User user){
        userService.DeleteData(user);
        return user;
    }
    @GetMapping("/username")
    public List<User> findByUserName(@RequestParam String username){
        return userService.findByUserName(username);
    }
    @GetMapping("/gmail")
    public List<User> findByGmail(@RequestParam String gmail){
        return userService.findByGmail(gmail);
    }
    @GetMapping("/phonenumber")
    public List<User> findByPhoneNumber(@RequestParam String phone_number){
        return userService.findByPhoneNumber(phone_number);
    }
}
