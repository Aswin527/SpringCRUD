package com.demo.test.Model.DAO.Registration;

import org.springframework.stereotype.Repository;

@Repository
public class RegistrationDAO {
	public RegistrationDAO() {
		System.out.println(this.getClass().getSimpleName());
	}
}
