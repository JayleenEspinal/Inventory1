package models;

import java.sql.Date;


public class Item {
    
    private Long ItemId;
    
    private ItemGroup ig;
    //COULD BE INCORRWCT MAP-wise, dlete comment once verified

    private int ItemNumber;

    private String ItemName; 
    
    private String ItemDescription;
    
    private Double InventoryBalance;
    
    private Date ExpirationDate;
    
    private Double UnitPrice;

    public Item() {
    }

    public Item(Long ItemId, ItemGroup ig, int ItemNumber, String ItemName, String ItemDescription, Double InventoryBalance, Date ExpirationDate, Double UnitPrice) {
        this.ItemId = ItemId;
        this.ig = ig;
        this.ItemNumber = ItemNumber;
        this.ItemName = ItemName;
        this.ItemDescription = ItemDescription;
        this.InventoryBalance = InventoryBalance;
        this.ExpirationDate = ExpirationDate;
        this.UnitPrice = UnitPrice;
    }

    public Long getItemId() {
        return ItemId;
    }

    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    public Long getItemGroupID() {
        return ig.getGroupID();
    }

    public void setItemGroupID(ItemGroup ig) {
        this.ig = ig;
    }

    public int getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(int ItemNumber) {
        this.ItemNumber = ItemNumber;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String ItemDescription) {
        this.ItemDescription = ItemDescription;
    }

    public Double getInventoryBalance() {
        return InventoryBalance;
    }

    public void setInventoryBalance(Double InventoryBalance) {
        this.InventoryBalance = InventoryBalance;
    }

    public Date getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(Date ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Items{");
        sb.append("ItemId=").append(ItemId);
        sb.append(", ItemGroupID=").append(ig.getGroupID());
        sb.append(", ItemNumber=").append(ItemNumber);
        sb.append(", ItemName=").append(ItemName);
        sb.append(", ItemDescription=").append(ItemDescription);
        sb.append(", InventoryBalance=").append(InventoryBalance);
        sb.append(", ExpirationDate=").append(ExpirationDate);
        sb.append(", UnitPrice=").append(UnitPrice);
        sb.append('}');
        return sb.toString();
    }
    
}
