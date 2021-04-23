package com.xworkz.register.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "details")
public class RegisterDTO implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	int id;

	@Column(name = "name")
	String fullName;

	@Column(name = "mail")
	String email;

	@Column(name = "num")
	long phoneno;

	@Column(name = "course")
	String courses;

	@Column(name = "crepass")
	String createPassword;

	@Column(name = "conpass")
	String confirmPassword;

	public RegisterDTO() {

	}

	public RegisterDTO(String fullName, String email, long phoneno, String courses, String createPassword,
			String confirmPassword) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.phoneno = phoneno;
		this.courses = courses;
		this.createPassword = createPassword;
		this.confirmPassword = confirmPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getCreatePassword() {
		return createPassword;
	}

	public void setCreatePassword(String createPassword) {
		this.createPassword = createPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneno=" + phoneno
				+ ", courses=" + courses + ", createPassword=" + createPassword + ", confirmPassword=" + confirmPassword
				+ "]";
	}

	 

}
