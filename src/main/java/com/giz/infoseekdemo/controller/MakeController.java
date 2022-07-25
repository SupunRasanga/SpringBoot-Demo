package com.giz.infoseekdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giz.infoseekdemo.domain.Make;
import com.giz.infoseekdemo.service.MakeService;

@RestController
@RequestMapping(path = "api/v1/make")
public class MakeController {

	@Autowired
	public MakeService makeService;
	
	@PostMapping
	public Make createMake(@RequestBody Make make) {
		return makeService.createMake(make);
	}
}
