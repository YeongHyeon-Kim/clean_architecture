package com.cleanarchitecture.merchandise.application.port.out;

import com.cleanarchitecture.merchandise.domain.Merchandise;

import java.util.List;

public interface LoadMerchandisePort {
	List<Merchandise> getAllMerchandise();
}
