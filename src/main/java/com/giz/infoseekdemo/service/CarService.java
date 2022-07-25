package com.giz.infoseekdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giz.infoseekdemo.domain.Car;
import com.giz.infoseekdemo.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
    
	// Post - Create Car
	public Car createCar(Car car) {
		return carRepository.save(car);
	}
}
