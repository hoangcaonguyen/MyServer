package nguyen.myserver.Entity;

public enum WorkType {
    fullTime(1), partTime(2);
    private final int workType;
    private WorkType(int workType){
        this.workType = workType;
    }
    public int getWorkType(){
        return workType;
    }
}
