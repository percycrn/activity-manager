package activityrecord;

public class ActivityRecord {

    private String userId;
    private String activityId;
    private String signInState;

    public ActivityRecord() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {

        this.activityId = activityId;
    }

    public String getSignInState() {
        return signInState;
    }

    public void setSignInState(String signInState) {
        this.signInState = signInState;
    }
}
