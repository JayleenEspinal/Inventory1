package models;


public class Users {
    private Long UserID;
    
    private String Username;
    
    private String Password;
    
    private String UserRole;
    
    private String EmailAddress;
    
    private String PhoneNumber;

    public Users() {
    }

    public Users(Long UserID, String Username, String Password, String UserRole, String EmailAddress, String PhoneNumber) {
        this.UserID = UserID;
        this.Username = Username;
        this.Password = Password;
        this.UserRole = UserRole;
        this.EmailAddress = EmailAddress;
        this.PhoneNumber = PhoneNumber;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long UserID) {
        this.UserID = UserID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserRole() {
        return UserRole;
    }

    public void setUserRole(String UserRole) {
        this.UserRole = UserRole;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Users{");
        sb.append(", UserID=").append(UserID);
        sb.append(", Username=").append(Username);
        sb.append(", Password=").append(Password);
        sb.append(", UserRole=").append(UserRole);
        sb.append(", EmailAddress=").append(EmailAddress);
        sb.append(", PhoneNumber=").append(PhoneNumber);
        sb.append("}");
        return sb.toString();
    }
}
