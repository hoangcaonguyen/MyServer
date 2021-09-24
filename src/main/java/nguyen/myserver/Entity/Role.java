package nguyen.myserver.Entity;

public enum Role {
    ROLE_ADMIN(1), ROLE_USER(2), ROLE_EMPLOYER(3);
    private final int roleNumber;
    private Role(int number){
        this.roleNumber = number;
    }
    public int getRoleNumber(){
        return roleNumber;
    }
}
