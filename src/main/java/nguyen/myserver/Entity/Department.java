package nguyen.myserver.Entity;

public enum Department {
    CNTT(1), ATTT(2), DTVT(3);
    private final int departmentNumber;
    private Department(int departmentNumber){
        this.departmentNumber = departmentNumber;
    }
    public int getDepartmentNumber(){
        return departmentNumber;
    }
}
