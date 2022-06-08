package com.cleanarchitecture.member.web.signup;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class SignupDto {
	private String nickname;
	private String email;
	private String password;
}
