package com.tka;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ShopLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int shoplocid;
String city;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "shoplocid")  // FK in Product table
private List<Product> products;
public ShopLocation(int shoplocid, String city, List<Product> products) {
	super();
	this.shoplocid = shoplocid;
	this.city = city;
	this.products = products;
}
public ShopLocation() {
	super();
}

public ShopLocation(String city, List<Product> products) {
	super();
	this.city = city;
	this.products = products;
}
public int getShoplocid() {
	return shoplocid;
}
public void setShoplocid(int shoplocid) {
	this.shoplocid = shoplocid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "ShopLocation [shoplocid=" + shoplocid + ", city=" + city + ", products=" + products + "]";
}

}
