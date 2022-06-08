package com.cleanarchitecture.member.domain;

import com.cleanarchitecture.member.persistence.Member;
import com.cleanarchitecture.member.web.signup.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {
	private final MemberRepository memberRepository;
	private final PasswordEncoder passwordEncoder;

	@Override
	public String signUp(String nickname, String email, String password) {
		if(!checkNickname(nickname)){
			return "닉네임의 길이가 20을 넘습니다.";
		}
		if(hasSameEmail(email)){
			return "이미 사용중인 이메일이거나 길이가 20을 넘습니다.";
		}
		if(!checkPassword(password)){
			return "길이가 30이하거나 영어로만 이루어진 비밀번호를 사용해주세요";
		}
		String hashPassword = passwordEncoder.encode(password);
		memberRepository.save(new Member(nickname, email, hashPassword));
		//Member()와 의존성 , JPA 안쓰고 저장하는 방법을 모름.....
//		memberRepository.save(nickname, email, password);
		return "가입에 성공했습니다";
	}

	private boolean checkNickname(String nickname) {
		if(nickname.length() > 20){
			return false;
		}else{
			return true;
		}
	}

	private boolean hasSameEmail(String email){
		if(memberRepository.existsMemberByEmail(email)){
			return true;
		}else if (email.length() >20) {
			return true;
		}else {
			return false;
		}
	}

	private boolean checkPassword(String password){
		if(password.length() >=30){
			return false;
		}else if(Pattern.matches("^[a-zA-Z]*$", password)){
			return false;
		}else{
			return true;
		}
	}

}
