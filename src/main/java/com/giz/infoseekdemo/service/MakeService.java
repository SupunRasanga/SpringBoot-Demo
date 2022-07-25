package com.giz.infoseekdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giz.infoseekdemo.domain.Make;
import com.giz.infoseekdemo.repository.MakeRepository;

@Service
public class MakeService {
	
	@Autowired
	private MakeRepository makeRepository;
	
	// Post - Create Make
	public Make createMake(Make make) {
		return makeRepository.save(make);
	}
}
