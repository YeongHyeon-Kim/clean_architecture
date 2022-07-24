package com.cleanarchitecture.member.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

interface JpaMemberRepository extends JpaRepository<JpaMemberEntity, Long> {

}
