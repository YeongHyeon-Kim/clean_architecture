package com.cleanarchitecture.merchandise.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;


interface JpaMerchandiseRepository extends JpaRepository<JpaMerchandiseEntity, Long> {

}
