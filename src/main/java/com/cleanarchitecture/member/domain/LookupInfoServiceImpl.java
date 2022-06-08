package com.cleanarchitecture.member.domain;

import com.cleanarchitecture.member.persistence.Member;
import com.cleanarchitecture.member.web.lookupInfo.LookupInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LookupInfoServiceImpl implements LookupInfoService {
	private final MemberRepository memberRepository;

	@Override
	public String lookup(Long id) {
		// TODO: 2022/06/08 이것도 안좋은 방법이라 했는데 다른사람들 어떻게 했는지 확인 필요
		Member member = memberRepository.findById(id).get();
		String result = "";
		result += "nickname : " + member.getNickname() + "\n";
		result += "email : " + member.getEmail();
		return result;
	}
}
