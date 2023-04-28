 package com.demo.test.Model.Services.Registration;

import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registration.StudentDTO;

@Service
public class RegistrationServices {
	
	public RegistrationServices() {
		System.out.println(this.getClass().getSimpleName()+" Created");
	}
	
	public void userRegistrationService(StudentDTO st) {
		System.out.println(this.getClass().getSimpleName()+" Started");
		
		System.out.println(this.getClass().getSimpleName()+" Ended");
	}
}
