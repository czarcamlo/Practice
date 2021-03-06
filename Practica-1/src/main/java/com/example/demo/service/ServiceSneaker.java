package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SneakerSell;
import com.example.demo.repository.SneakerRepository;
import com.example.demo.sneakertype.SneakerType;



@Service
public class ServiceSneaker {
	
	@Autowired
	SneakerRepository repo;
	
	public SneakerSell createSneaker (SneakerSell sneaker) throws Exception {
		SneakerSell  customer = repo.findByPhone(sneaker.getPhone());
		if (customer != null ) {
			throw new Exception("User exist") ;
		}
	return repo.save(sneaker);
		}
	
	public Optional<SneakerSell> getSneaker (Long id)  {
		Optional<SneakerSell> customer = repo.findById(id);
	
		return customer;
		}

	public void deleteSneaker (Long id)  throws Exception {
		Optional<SneakerSell> customer = repo.findById(id);
		if (!customer.isPresent()) {
			throw new Exception("client not existing ");
		}
		repo.deleteById(id);
		}
	
	public SneakerSell change (Long id, SneakerSell user) throws Exception {
		Optional<SneakerSell> customer = repo.findById(id);
		if (!customer.isPresent()) {
			throw new Exception("client not existing ");
		}
		user.setPhone(user.getPhone());
		repo.save(user);
		return repo.save(user);
		}
}
