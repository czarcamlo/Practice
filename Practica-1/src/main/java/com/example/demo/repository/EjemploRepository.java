package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EntityEjemplo;

public interface EjemploRepository extends JpaRepository<EntityEjemplo, Long> {

	
}
