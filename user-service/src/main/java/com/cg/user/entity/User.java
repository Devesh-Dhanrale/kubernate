package com.cg.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kuser")
public class User {

	@Id
	
	private Long uid;
	private String uname;
	private String uaddress;
	private String ucode;
	private Long did;

	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", ucode=" + ucode + ", did=" + did
				+ "]";
	}





	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getUid() {
		return uid;
	}


	public void setUid(Long uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUaddress() {
		return uaddress;
	}


	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}


	public String getUcode() {
		return ucode;
	}


	public void setUcode(String ucode) {
		this.ucode = ucode;
	}


	public Long getDid() {
		return did;
	}


	public void setDid(Long did) {
		this.did = did;
	}



	
	public User(Long uid, String uname, String uaddress, String ucode, Long did) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uaddress = uaddress;
		this.ucode = ucode;
		this.did = did;
	}

	

	
}
