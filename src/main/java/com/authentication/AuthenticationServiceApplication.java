package com.authentication;

import com.authentication.model.signup.Signuser;
import com.authentication.repository.signup.SignUpUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AuthenticationServiceApplication {

	@Autowired
	private SignUpUserRepository signUpUserRepository;

	@PostConstruct
	public void fun(){
		Signuser signuser1 = new Signuser("'biswa'", "jeet", "biswajeet162@gmail.com", "123","9997455512", true);
		signUpUserRepository.save(signuser1);

		Signuser signuser2 = new Signuser("'deepak'", "roy", "deepak162@gmail.com", "123","7895533374", true);
		signUpUserRepository.save(signuser2);

		Signuser signuser3 = new Signuser("'pankaj'", "mandal", "pankaj162@gmail.com", "123","8755222201", true);
		signUpUserRepository.save(signuser3);

		Signuser signuser4 = new Signuser("'vidhan'", "gain", "vidhan162@gmail.com", "123","123456789", true);
		signUpUserRepository.save(signuser4);
	}

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationServiceApplication.class, args);
	}

}
