package com.cleanarchitecture.member.web.login;

import com.cleanarchitecture.member.web.lookupInfo.LookupInfoService;
import com.cleanarchitecture.member.web.signup.SignupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class LoginController {
	private final LoginService loginService;
	private final HttpSession session;

	@PostMapping("/user/login")
	public String login(@RequestBody LoginDto loginDto){
		Long id = loginService.login(loginDto.getEmail(), loginDto.getPassword());
		return null;
//		return result;
	}
}
