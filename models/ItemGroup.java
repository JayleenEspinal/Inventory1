package models;



public class ItemGroup {
    private Long GroupID;
    
    private String GroupName;

    public ItemGroup(Long GroupID, String GroupName) {
        this.GroupID = GroupID;
        this.GroupName = GroupName;
    }

    public ItemGroup() {
    }

    public Long getGroupID() {
        return GroupID;
    }

    public void setGroupID(Long GroupID) {
        this.GroupID = GroupID;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item Groups{");
        sb.append("GroupID=").append(GroupID);
        sb.append(", GroupName=").append(GroupName);
        sb.append('}');
        return sb.toString();
    }
    
}
