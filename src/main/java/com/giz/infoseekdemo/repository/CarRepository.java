package com.giz.infoseekdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giz.infoseekdemo.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
