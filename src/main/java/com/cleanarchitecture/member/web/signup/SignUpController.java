package com.cleanarchitecture.member.web.signup;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignUpController {

	private final SignUpService signUpService;

	@PostMapping("/user/signup")
	public String signUp(@RequestBody SignupDto signupDto){
		String result = signUpService.signUp(signupDto.getNickname(), signupDto.getEmail(), signupDto.getPassword());
		return result;
	}
}
