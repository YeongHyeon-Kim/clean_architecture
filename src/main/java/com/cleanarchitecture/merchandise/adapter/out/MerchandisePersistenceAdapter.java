package com.cleanarchitecture.merchandise.adapter.out;

import com.cleanarchitecture.merchandise.application.port.out.LoadMerchandisePort;
import com.cleanarchitecture.merchandise.domain.Merchandise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
class MerchandisePersistenceAdapter implements LoadMerchandisePort {

	private final JpaMerchandiseRepository jpaMerchandiseRepository;
	private final MerchandiseMapper merchandiseMapper;
	@Override
	public List<Merchandise> getAllMerchandise() {

		return merchandiseMapper.mapToDomainMerchandise(jpaMerchandiseRepository.findAll());
	}
}
