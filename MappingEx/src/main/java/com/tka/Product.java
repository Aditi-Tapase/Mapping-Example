package com.tka;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String pname;


public Product(int id, String pname) {
	super();
	this.id = id;
	this.pname = pname;
	
}


public Product(String pname) {
	super();
	this.pname = pname;
}


public Product() {
	super();
}

public Product(int id) {
	super();
	this.id = id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}





@Override
public String toString() {
	return "Product [id=" + id + ", pname=" + pname + "]";
}



	
}
