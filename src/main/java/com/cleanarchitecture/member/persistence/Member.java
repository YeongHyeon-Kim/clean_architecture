package com.cleanarchitecture.member.persistence;

import lombok.*;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nickname;

	private String email;

	private String password;


	public Member(String nickname, String email, String password) {
		this.nickname = nickname;
		this.email = email;
		this.password = password;
	}
}
