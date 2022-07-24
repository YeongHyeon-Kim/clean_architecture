package com.cleanarchitecture.merchandise.domain;

import lombok.Builder;

public class Merchandise {
	private Long id;

	private String merchandiseName;

	private Long merchandisePointPerUnitTime;

	private Long merchandisePrice;

	private String merchandiseInfo;

	@Builder
	public Merchandise(Long id, String merchandiseName, Long merchandisePointPerUnitTime, Long merchandisePrice, String merchandiseInfo) {
		this.id = id;
		this.merchandiseName = merchandiseName;
		this.merchandisePointPerUnitTime = merchandisePointPerUnitTime;
		this.merchandisePrice = merchandisePrice;
		this.merchandiseInfo = merchandiseInfo;
	}

}
