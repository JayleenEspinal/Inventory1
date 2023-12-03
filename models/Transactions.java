package models;

import java.sql.Date;


public class Transactions {
    
    private Long TransactionID;
    
    private Date TransactionDate;
    
    private TransactionEnum TransactionType;
    
    private enum TransactionEnum{
        Received, 
        Used, 
        Discarded, 
        Other
    }
    
    private Users UserID;
    
    private Supplier SupplierID;

    public Transactions() {
    }

    public Transactions(Long TransactionID, Date TransactionDate, TransactionEnum TransactionType, Users UserID, Supplier SupplierID) {
        this.TransactionID = TransactionID;
        this.TransactionDate = TransactionDate;
        this.TransactionType = TransactionType;
        this.UserID = UserID;
        this.SupplierID = SupplierID;
    }

    public Long getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(Long TransactionID) {
        this.TransactionID = TransactionID;
    }

    public Date getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(Date TransactionDate) {
        this.TransactionDate = TransactionDate;
    }

    public TransactionEnum getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(TransactionEnum TransactionType) {
        this.TransactionType = TransactionType;
    }

    public Long getUserID() {
        return UserID.getUserID();
    }

    public void setUserID(Users UserID) {
        this.UserID = UserID;
    }

    public Long getSupplierID() {
        return SupplierID.getSupplierID();
    }

    public void setSupplierID(Supplier SupplierID) {
        this.SupplierID = SupplierID;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Transactions{");
        sb.append(", TransactionID").append(TransactionID);
        sb.append(", TransactionDate").append(TransactionDate);
        sb.append(", TransactionType").append(TransactionType);
        sb.append(", UserID").append(UserID);
        sb.append(", SupplierID").append(SupplierID);
        sb.append("}");
        return sb.toString();
    }
}
