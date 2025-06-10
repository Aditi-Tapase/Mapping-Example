package com.tka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MobileDetails {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int mobiledetailsId;
	private int RAM;
	private int ROM;
	public MobileDetails() {
		super();
	}
	
	
	public MobileDetails(int mobiledetailsId) {
		super();
		this.mobiledetailsId = mobiledetailsId;
	}


	public MobileDetails(int rAM, int rOM) {
		super();
		RAM = rAM;
		ROM = rOM;
	}
	public int getMobiledetailsId() {
		return mobiledetailsId;
	}
	public void setMobiledetailsId(int mobiledetailsId) {
		this.mobiledetailsId = mobiledetailsId;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getROM() {
		return ROM;
	}
	public void setROM(int rOM) {
		ROM = rOM;
	}
	@Override
	public String toString() {
		return "MobileDetails [mobiledetailsId=" + mobiledetailsId + ", RAM=" + RAM + ", ROM=" + ROM + "]";
	}
	
	
	

}
