package nguyen.myserver.Entity;

public enum PostStatus {
    waiting(1), Approved(2), notApproved(3);
    private final int poststatus;
    private PostStatus(int poststatus){
        this.poststatus = poststatus;
    }
    public int getPoststatus(){
        return poststatus;
    }
}
