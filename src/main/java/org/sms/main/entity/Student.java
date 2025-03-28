package org.sms.main.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Student extends User{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String studentName;
	private String dob;
	private String gender;
	private String studentCode;
	private String fatherName;
	private String motherName;
	private String email;
	private long phno;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
	private List<Address> addresses;

	@ManyToMany
	@JoinTable(name = "Student_Courses", joinColumns = { @JoinColumn(name = "Student_Code") }, inverseJoinColumns = {
			@JoinColumn(name="Course_Name") })
	private List<Courses> courses;

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.studentCode;
		
		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String dob, String gender, String studentCode, String fatherName,
			String motherName, String email, long phno, List<Address> addresses, List<Courses> courses) {
		super();
		this.studentName = studentName;
		this.dob = dob;
		this.gender = gender;
		this.studentCode = studentCode;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.email = email;
		this.phno = phno;
		this.addresses = addresses;
		this.courses = courses;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
}
