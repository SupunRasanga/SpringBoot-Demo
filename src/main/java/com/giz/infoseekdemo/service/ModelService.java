package com.giz.infoseekdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giz.infoseekdemo.domain.Model;
import com.giz.infoseekdemo.repository.ModelRepository;

@Service
public class ModelService {
	
	@Autowired
	private ModelRepository modelRepository;
	
	// Post - Create Model
	public Model createModel(Model model) {
		return modelRepository.save(model);
	}
}
