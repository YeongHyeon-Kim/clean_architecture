package com.cleanarchitecture.merchandise.application;

import com.cleanarchitecture.merchandise.application.port.in.MerchandiseUseCase;
import com.cleanarchitecture.merchandise.application.port.out.LoadMerchandisePort;
import com.cleanarchitecture.merchandise.domain.Merchandise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class MerchandiseService implements MerchandiseUseCase {

	private final LoadMerchandisePort loadMerchandisePort;
	@Override
	public List<Merchandise> getAllMerchandise() {
		return loadMerchandisePort.getAllMerchandise();
	}
}
