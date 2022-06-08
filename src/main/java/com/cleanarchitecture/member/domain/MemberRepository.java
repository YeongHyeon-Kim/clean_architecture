package com.cleanarchitecture.member.domain;

import com.cleanarchitecture.member.persistence.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
	boolean existsMemberByEmail(String email);
}
