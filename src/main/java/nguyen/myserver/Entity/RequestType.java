package nguyen.myserver.Entity;

public enum RequestType {
    officialJob(1), intership(2);
    private final int requestType;
    private RequestType(int requestType){
        this.requestType = requestType;
    }
    public int getRequestType(){
        return requestType;
    }
}
