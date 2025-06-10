package com.tka;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int clsid;
	String clsname;
	public Classroom(int clsid, String clsname) {
		super();
		this.clsid = clsid;
		this.clsname = clsname;
	}
	public Classroom() {
		super();
	}
	public Classroom(String clsname) {
		super();
		this.clsname = clsname;
	}
	public int getClsid() {
		return clsid;
	}
	public void setClsid(int clsid) {
		this.clsid = clsid;
	}
	public String getClsname() {
		return clsname;
	}
	public void setClsname(String clsname) {
		this.clsname = clsname;
	}
	@Override
	public String toString() {
		return "Classroom [clsid=" + clsid + ", clsname=" + clsname + "]";
	}
	
	
	
	

}
