package org.sms.main.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public abstract class Admin extends User{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adminName;
	private String username;
	private long phno;
	
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Admin(String adminName, String username, long phno) {
		super();
		this.adminName = adminName;
		this.username = username;
		this.phno = phno;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
