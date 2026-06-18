package com.HibernateApps;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
	@Column
private String pname;
	@Column
private double price;
public product() {
	super();
	// TODO Auto-generated constructor stub
}
public product(int pid, String pname, double price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
