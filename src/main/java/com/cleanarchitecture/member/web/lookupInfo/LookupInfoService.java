package com.cleanarchitecture.member.web.lookupInfo;

import com.cleanarchitecture.member.persistence.Member;

public interface LookupInfoService {
	//여기도 의존성 가져오는데 괜찮은건가?,, --> 그래서 거의 억지로 아래 결과로 바꿨는데 실제로는 이게 의미가 없을듯?,,
//	Member lookup(Long id);

	String lookup(Long id);
}
