package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SneakerSell;

public interface SneakerRepository extends JpaRepository<SneakerSell, Long> {
	
	SneakerSell findByPhone (String  phone);

}
