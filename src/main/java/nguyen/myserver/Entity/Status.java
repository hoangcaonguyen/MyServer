package nguyen.myserver.Entity;

public enum Status {
    Graduated(1), notGraduated(2);
    private final int status;
    Status(int status){
        this.status = status;
    }
    public int getStatus(){
        return status;
    }
}
