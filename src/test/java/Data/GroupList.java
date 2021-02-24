package Data;

public class GroupList {
    private int groupId;
    private String groupName;
    private String groupHeader;
    private String groupFooter;



    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public void setGroupHeader(String groupHeader) {
        this.groupHeader = groupHeader;
    }

    public String getGroupFooter() {
        return groupFooter;
    }

    public void setGroupFooter(String groupFooter) {
        this.groupFooter = groupFooter;
    }

    @Override
    public String toString() {
        return "GroupList{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", groupHeader='" + groupHeader + '\'' +
                ", groupFooter='" + groupFooter + '\'' +
                '}';
    }
}
