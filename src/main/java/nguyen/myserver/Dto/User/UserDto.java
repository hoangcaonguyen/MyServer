package nguyen.myserver.Dto.User;

import lombok.Getter;
import lombok.Setter;
import nguyen.myserver.Entity.Role;

import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class UserDto {
    @Size(min = 6, max = 30, message = "Name must be between 2 and 32 characters long")
    private String username;
    private String full_name;
    private List<Role> roles;
    private String gmail;
    private String phone_number;
}
