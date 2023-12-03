
package models;



public class Supplier {
    private Long SupplierID;
    
    private String SupplierName;
    
    private String SupplierAddress;
    
    private String SupplierPhoneNumber;

    public Supplier() {
    }

    public Supplier(Long SupplierID, String SupplierName, String SupplierAddress, String SupplierPhoneNumber) {
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.SupplierAddress = SupplierAddress;
        this.SupplierPhoneNumber = SupplierPhoneNumber;
    }

    public Long getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(Long SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getSupplierAddress() {
        return SupplierAddress;
    }

    public void setSupplierAddress(String SupplierAddress) {
        this.SupplierAddress = SupplierAddress;
    }

    public String getSupplierPhoneNumber() {
        return SupplierPhoneNumber;
    }

    public void setSupplierPhoneNumber(String SupplierPhoneNumber) {
        this.SupplierPhoneNumber = SupplierPhoneNumber;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers{");
        sb.append("SupplierID=").append(SupplierID);
        sb.append(", SupplierName=").append(SupplierName);
        sb.append(", SupplierAddress=").append(SupplierAddress);
        sb.append(", SupplierPhoneNumber=").append(SupplierPhoneNumber);
        sb.append('}');
        return sb.toString();
    }
    
}
