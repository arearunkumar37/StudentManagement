package org.sms.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
	
	@Id
	private String roleName;

	public void setRoleName(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getRoleName() {
		// TODO Auto-generated method stub
		return null;
	}
}
