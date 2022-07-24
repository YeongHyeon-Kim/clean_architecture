package com.cleanarchitecture.member.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
	USER("ROE_USER"), ADMIN("ROLE_ADMIN"), CLIENT("ROLE_CLIENT");
	private final String key;
}
