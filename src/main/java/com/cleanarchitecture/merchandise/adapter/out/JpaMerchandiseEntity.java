package com.cleanarchitecture.merchandise.adapter.out;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "merchandise")
@NoArgsConstructor
@Getter
class JpaMerchandiseEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String merchandiseName;

	@Column(nullable = false)
	private Long merchandisePointPerUnitTime;

	@Column(nullable = false)
	private Long merchandisePrice;

	@Column(nullable = false)
	private String merchandiseInfo;

	@Builder
	public JpaMerchandiseEntity(Long id, String merchandiseName, Long merchandisePointPerUnitTime, Long merchandisePrice, String merchandiseInfo) {
		this.id = id;
		this.merchandiseName = merchandiseName;
		this.merchandisePointPerUnitTime = merchandisePointPerUnitTime;
		this.merchandisePrice = merchandisePrice;
		this.merchandiseInfo = merchandiseInfo;
	}
}
