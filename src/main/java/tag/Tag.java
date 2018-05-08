package tag;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tag {
    @Id
    @GeneratedValue
    private String tagId;
    private String tagName;

    public Tag() {
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
