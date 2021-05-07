package com.cg.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "kdept")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long did;
	private String dname;
	private String daddress;
	private String dcode;

	
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", daddress=" + daddress + ", dcode=" + dcode + "]";
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(Long did, String dname, String daddress, String dcode) {
		super();
		this.did = did;
		this.dname = dname;
		this.daddress = daddress;
		this.dcode = dcode;
	}

	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	public String getDcode() {
		return dcode;
	}
	public void setDcode(String dcode) {
		this.dcode = dcode;
	}
	
}
