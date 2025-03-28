package org.sms.main.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
	
	private String token;
	private Object user;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Object getUser() {
		return user;
	}
	public void setUser(Object user) {
		this.user = user;
	}
	public JwtResponse(String token, Object user) {
		super();
		this.token = token;
		this.user = user;
	}
	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
