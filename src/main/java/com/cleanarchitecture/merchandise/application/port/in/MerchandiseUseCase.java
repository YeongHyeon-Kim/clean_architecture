package com.cleanarchitecture.merchandise.application.port.in;

import com.cleanarchitecture.merchandise.domain.Merchandise;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MerchandiseUseCase {
	List<Merchandise> getAllMerchandise();
}
