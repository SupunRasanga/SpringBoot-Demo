package com.giz.infoseekdemo.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.giz.infoseekdemo.domain.Make;
import com.giz.infoseekdemo.repository.MakeRepository;

@SpringBootTest
public class MakeRepositoryTest {

	@Autowired
	private MakeRepository makeRepository;
	
//	@Test
//	public void createMake() {
//		Make mke = Make.builder()
//				.make("NISSAN")
//				.status("A")
//				.build();
//				
//		makeRepository.save(mke);
//	}
//	
	@Test
	public void getAllMakes() {
		List<Make> make = makeRepository.findAll();
		for(Make m: make) {
			System.out.println(m);
		}
	}
}
