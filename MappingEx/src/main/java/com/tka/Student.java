package com.tka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
@ManyToOne
@JoinColumn(name="clsid")
Classroom clsroom;
public Student(int id, String name, Classroom clsroom) {
	super();
	this.id = id;
	this.name = name;
	this.clsroom = clsroom;
}
public Student(String name, Classroom clsroom) {
	super();
	this.name = name;
	this.clsroom = clsroom;
}
public Student() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Classroom getClsroom() {
	return clsroom;
}
public void setClsroom(Classroom clsroom) {
	this.clsroom = clsroom;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", clsroom=" + clsroom + "]";
}


}
