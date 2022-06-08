package com.cleanarchitecture.member.web.login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginDto {
	private String email;
	private String password;
}
