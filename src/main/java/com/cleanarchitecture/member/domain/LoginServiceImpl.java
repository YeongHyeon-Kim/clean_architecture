package com.cleanarchitecture.member.domain;

import com.cleanarchitecture.member.web.login.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {
	private final PasswordEncoder passwordEncoder;
	private final MemberRepository memberRepository;
	@Override
	public Long login(String email, String password) {

		return null;
//		passwordEncoder.matches(password, encodedPassword);
	}
}
