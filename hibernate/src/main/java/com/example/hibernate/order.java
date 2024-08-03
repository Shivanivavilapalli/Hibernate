package com.example.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
	
	@Column(name="")
	private String ordername;
	
	private String orderemail;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getOrderemail() {
		return orderemail;
	}
	public void setOrderemail(String orderemail) {
		this.orderemail = orderemail;
	}
	public order(int orderid, String ordername, String orderemail) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
		this.orderemail = orderemail;
	}
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
