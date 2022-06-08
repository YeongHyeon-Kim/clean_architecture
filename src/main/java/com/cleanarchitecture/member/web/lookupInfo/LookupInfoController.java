package com.cleanarchitecture.member.web.lookupInfo;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class LookupInfoController {
	private final LookupInfoService lookupInfoService;
	private final HttpSession session;

	@GetMapping("/user/lookup")
	public String lookup(){
		Object id = session.getAttribute("logInUserInfo");
		if (id==null){
			return "로그인하지 않았습니다";
		}else{
			String result = lookupInfoService.lookup((Long)id);
			return result;
		}
	}
}
