package com.cleanarchitecture.member.adapter.in;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

	@PostMapping("/join")
	public ResponseEntity<?> join(){

	}

	@PostMapping("/login")
	public ResponseEntity<?> login(){

	}

	@PostMapping("/subscribeMerchandise")
	public ResponseEntity<?> subscribeMerchandise(){

	}


	@GetMapping("/getSubscribeMerchandise")
	public ResponseEntity<?> getSubscribeMerchandise(){

	}
}

