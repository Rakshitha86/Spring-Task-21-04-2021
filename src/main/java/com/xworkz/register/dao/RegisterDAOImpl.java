package com.xworkz.register.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.xworkz.register.dto.RegisterDTO;

@Component
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveRegister(RegisterDTO registerDTO) {

		String sql = "insert into details (id,name,mail,num,course,crepass,conpass) values(?,?,?,?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			jdbcTemplate.update(sql,
					new Object[] { registerDTO.getId(), registerDTO.getFullName(), registerDTO.getEmail(),
							registerDTO.getPhoneno(), registerDTO.getCourses(), registerDTO.getCreatePassword(),
							registerDTO.getConfirmPassword() });
			System.out.println("inserted records");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
