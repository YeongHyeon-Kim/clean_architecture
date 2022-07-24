package com.cleanarchitecture.merchandise.adapter.out;

import com.cleanarchitecture.merchandise.domain.Merchandise;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class MerchandiseMapper {
	List<Merchandise> mapToDomainMerchandise(List<JpaMerchandiseEntity> jpaMerchandise){

		List<Merchandise> merchandises = new ArrayList<>();
		for (int i = 0; i < jpaMerchandise.size(); i++) {
			JpaMerchandiseEntity jpaMerchandiseEntity = jpaMerchandise.get(i);
			merchandises.add(Merchandise.builder().id(jpaMerchandiseEntity.getId())
					.merchandiseInfo(jpaMerchandiseEntity.getMerchandiseInfo())
					.merchandiseName(jpaMerchandiseEntity.getMerchandiseName())
					.merchandisePrice(jpaMerchandiseEntity.getMerchandisePrice())
					.merchandisePointPerUnitTime(jpaMerchandiseEntity.getMerchandisePointPerUnitTime())
					.build()
			);
		}
		return merchandises;
	}
}
