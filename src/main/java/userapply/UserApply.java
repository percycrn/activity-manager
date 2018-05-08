package userapply;

import javax.persistence.Id;
import java.util.Date;

//申请表实体类， 用来存储用户的申请信息
public class UserApply {

    @Id
    private String userId;
    private String tagName;
    private String applyState;
    private Date applyTime;

    public UserApply() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getApplyState() {
        return applyState;
    }

    public void setApplyState(String applyState) {
        this.applyState = applyState;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}
