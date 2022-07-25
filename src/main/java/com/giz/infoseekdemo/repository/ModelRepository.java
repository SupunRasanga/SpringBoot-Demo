package com.giz.infoseekdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giz.infoseekdemo.domain.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {

}
