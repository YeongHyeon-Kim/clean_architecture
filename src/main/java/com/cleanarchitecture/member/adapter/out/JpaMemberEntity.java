package com.cleanarchitecture.member.adapter.out;

import lombok.Builder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

class JpaMemberEntity {
	@Id
	@Column(name = "USER_SEQ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userSeq;

	@Column
	@NotNull
	private String userId;

	@Column(name = "USERNAME", length = 100)
	@NotNull
	@Size(max = 100)
	private String username;

	@Column(name = "EMAIL", length = 512)
	@NotNull
	@Size(max = 512)
	private String email;

	@Column(name = "ROLE", length = 100)
	@NotNull
	@Enumerated(value = EnumType.STRING)
	private String role;

	@Column(name = "PROVIDER_TYPE")
	@NotNull
	private String providerType;

	@Column(name = "POINT", columnDefinition ="integer default 0")
	private int point;

	@Builder
	public JpaMemberEntity(String userId, String username, String email, String role, String providerType, int point) {
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.role = role;
		this.providerType = providerType;
		this.point = point;
	}
}
