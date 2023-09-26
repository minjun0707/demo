package com.example.demo.domain.user;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserRepository userRepository;

	@GetMapping("/api/home")
	public String home() {
		return "GCU OK";
	}

	@PostMapping("/api/user")
	public User userApi() {
		User user = new User(1,"나는 민준",new Date());
		return user;
	}

	@PostMapping("/api/user/create")
	public String createUser(@RequestBody User user) {
		userRepository.save(user);

		return "create user ok";
	}

}
