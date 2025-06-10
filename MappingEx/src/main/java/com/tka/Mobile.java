package com.tka;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int MobId;
	private String BrandName;
	private double cost;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobiledetailsId")
	MobileDetails details;

	public Mobile() {
		super();
	}
	

	public Mobile(int mobId) {
		super();
		MobId = mobId;
	}


	public Mobile(String brandName, double cost, MobileDetails details) {
		super();
		BrandName = brandName;
		this.cost = cost;
		this.details = details;
	}

	public int getMobId() {
		return MobId;
	}

	public void setMobId(int mobId) {
		MobId = mobId;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public MobileDetails getDetails() {
		return details;
	}

	public void setDetails(MobileDetails details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Mobile [MobId=" + MobId + ", BrandName=" + BrandName + ", cost=" + cost + ", details=" + details + "]";
	}

	
}
