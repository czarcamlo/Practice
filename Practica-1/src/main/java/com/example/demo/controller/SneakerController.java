package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SneakerSell;
import com.example.demo.service.ServiceSneaker;

@RestController
public class SneakerController {
	@Autowired
	ServiceSneaker service;
	
	@PostMapping("/create")
	public SneakerSell create (@RequestBody SneakerSell sell) throws Exception {
		return service.createSneaker(sell);
		}
	
	@GetMapping ("/client/{id}")
	public Optional<SneakerSell> getSneaker(@PathVariable ("id") Long id) {
		return service.getSneaker(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteSneaker(@PathVariable ("id") Long id) throws Exception{
		service.deleteSneaker(id);
	}
	
	@PutMapping("/modify/{id}")
	public SneakerSell modify (@PathVariable ("id") Long id, @RequestBody SneakerSell user) throws Exception {
		return service.change(id, user);
	}
	

}
