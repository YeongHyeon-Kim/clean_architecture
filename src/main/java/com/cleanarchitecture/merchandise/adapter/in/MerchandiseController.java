package com.cleanarchitecture.merchandise.adapter.in;

import com.cleanarchitecture.member_before.dto.JsonResponse;
import com.cleanarchitecture.merchandise.application.port.in.MerchandiseUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MerchandiseController {
	private final MerchandiseUseCase merchandiseUseCase;

	@GetMapping("/allMerchandise")
	public ResponseEntity<?> allMerchandise(){
		return JsonResponse.okWithData(merchandiseUseCase.getAllMerchandise(), "");
	}
}
