package nguyen.myserver.Controller;

import nguyen.myserver.Entity.User;
import nguyen.myserver.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    private UserService userService;
    @Autowired
    public AccountController(UserService userService){this.userService = userService;}
    @PostMapping(value = "/resigne", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User saveData(@RequestBody User user){
        userService.SaveData(user);
        return user;
    }
}
