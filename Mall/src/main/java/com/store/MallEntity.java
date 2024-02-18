package com.store;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class MallEntity {
private Integer shopID;
private String shopCategory;
private String shopName;
private String customers;
private String shopStatus;
private String leaseStatus;


//default constructor
public MallEntity() 
{


}


//parameterized constructor
public MallEntity(Integer shopID, String shopCategory, String shopName, String customers, String shopStatus,
		String leaseStatus) 
{
	this.shopID = shopID;
	this.shopCategory = shopCategory;
	this.shopName = shopName;
	this.customers = customers;
	this.shopStatus = shopStatus;
	this.leaseStatus = leaseStatus;
}

@Id
public Integer getShopID() {
	return shopID;
}
public void setShopID(Integer shopID) {
	this.shopID = shopID;
}
public String getShopCategory() {
	return shopCategory;
}
public void setShopCategory(String shopCategory) {
	this.shopCategory = shopCategory;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getCustomers() {
	return customers;
}
public void setCustomers(String customers) {
	this.customers = customers;
}
public String getShopStatus() {
	return shopStatus;
}
public void setShopStatus(String shopStatus) {
	this.shopStatus = shopStatus;
}
public String getLeaseStatus() {
	return leaseStatus;
}
public void setLeaseStatus(String leaseStatus) {
	this.leaseStatus = leaseStatus;
}
//to string method


@Override
public String toString() {
	return "MallEntity [shopID=" + shopID + ", shopCategory=" + shopCategory + ", shopName=" + shopName + ", customers="
			+ customers + ", shopStatus=" + shopStatus + ", leaseStatus=" + leaseStatus + "]";
}


}
