package com.cleanarchitecture.member.domain;

import com.cleanarchitecture.member.persistence.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SignUpServiceImplTest {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	void signUp() {
		String nickname = "kim";
		String email = "kim@naver.com";
		String password = "1234";
		//종료시킬 방법?,,, 아니면 다른 식으로 테스트?..
		if(hasSameEmail(email)){
			System.out.println("이미 사용중인 이메일입니다");
		}
		if(!checkPassword(password)){
			System.out.println("길이가 30이하거나 영어로만 이루어진 비밀번호를 사용해주세요");
		}
		String encodedPassword = passwordEncoder.encode(password);
		memberRepository.save(new Member(nickname, email, encodedPassword));

		Optional<Member> check = memberRepository.findById(1L);
		Member check1 = check.get();
		System.out.println(check1.getEmail());
		System.out.println(check1.getNickname());
		System.out.println(nickname);

		assertNotEquals(password, encodedPassword);
		assertTrue(passwordEncoder.matches(password, encodedPassword));

		assertTrue(check1.getNickname().equals(nickname));
		assertTrue(check1.getEmail().equals(email));
		assertTrue(check1.getPassword().equals(encodedPassword));
	}

	public boolean hasSameEmail(String email){
		if(memberRepository.existsMemberByEmail(email)){
			return true;
		}else{
			return false;
		}
	}

	public boolean checkPassword(String password){
		if(password.length() >=30){
			return false;
		}else if(Pattern.matches("^[a-zA-Z]*$", password)){
			return false;
		}else{
			return true;
		}
	}
}