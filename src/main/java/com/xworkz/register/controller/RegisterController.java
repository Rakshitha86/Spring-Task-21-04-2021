package com.xworkz.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dto.RegisterDTO;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

@Component
@RequestMapping("/")
public class RegisterController {

	@Autowired
	private RegisterDAO dao;

	public RegisterController() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created ");
	}

	@RequestMapping("/register.do")
	private String onRegister(@RequestParam String name, @RequestParam String mail, @RequestParam long phoneno,
			@RequestParam String course, @RequestParam String crepass, @RequestParam String conpass, Model model) {
		System.out.println("invoked onRegister()");
		RegisterDTO dto = new RegisterDTO(name, mail, phoneno, course, crepass, conpass);
		System.out.println(dto);
		RegisterService service = new RegisterServiceImpl(dao);
		service.validateAndSave(dto);
		return "/Success.jsp";
	}
}
