package com.xworkz.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dto.RegisterDTO;

@Component
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterDAO dao;

	public RegisterServiceImpl(RegisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(RegisterDTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null, can validate");

			String fullname = dto.getFullName();
			if (fullname != null && !fullname.isEmpty() && !fullname.contentEquals(" ")) {
				System.out.println("fullname is valid");
				validData = true;
			} else {
				System.out.println("fullname is not valid");
				validData = false;
			}
			if (validData) {
				String emailId = dto.getEmail();
				if (emailId != null && !emailId.isEmpty() && !emailId.contentEquals(" ")) {
					System.out.println("emailId is valid");
					validData = true;
				} else {
					System.out.println("emailId is not valid");
					validData = false;
				}
			}
			if (validData) {
				String course = dto.getCourses();
				if (course != null && !course.isEmpty() && !course.contentEquals(" ")) {
					System.out.println("course is valid");
					validData = true;
				} else {
					System.out.println("course is not valid");
					validData = false;
				}
			}
			if (validData) {
				long number = dto.getPhoneno();
				if (number > 0) {
					System.out.println("number is valid");
					validData = true;
				} else {
					System.out.println("number is not valid");
					validData = false;
				}
			}
			if (validData) {
				String createPassword = dto.getCreatePassword();
				if (createPassword != null && !createPassword.isEmpty() && !createPassword.contentEquals(" ")) {
					System.out.println("createPassword is valid");
					validData = true;
				} else {
					System.out.println("createPassword is not valid");
					validData = false;
				}
			}

			if (validData) {
				String confirmPassword = dto.getConfirmPassword();
				if (confirmPassword != null && !confirmPassword.isEmpty() && !confirmPassword.contentEquals(" ")) {
					System.out.println("confirmPassword is valid");
					validData = true;
				} else {
					System.out.println("confirmPassword is not valid");
					validData = false;
				}

			}
			if (validData) {
				System.out.println("Invoke save method, data is valid");
				dao.saveRegister(dto);
			}
		} else {
			System.out.println("dto is null, invalid data");
		}
		return false;
	}

}
