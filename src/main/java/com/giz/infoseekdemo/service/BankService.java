package com.giz.infoseekdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.giz.infoseekdemo.domain.Bank;
import com.giz.infoseekdemo.repository.BankRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepository;
	
	//Post - Create Bank 
	public Bank createBank(Bank bank) {
		return bankRepository.save(bank);
	}
	//Get - Get All Banks
	public List<Bank> getAllBanks() {		
		return bankRepository.findAll();
	}
	//Get - Get By Id
	public Optional<Bank> getBankById(long bankId) {		
		return bankRepository.findById(bankId);
	}
	//Put - Update Bank
	public Bank updateBank(long bankId, Bank bank) {
		Bank existingBank = bankRepository.getById(bankId);
		if (existingBank != null) {
			existingBank.setName(bank.getName());
			existingBank.setCode(bank.getCode());
			existingBank.setIncorporateDate(bank.getIncorporateDate());
			existingBank.setNoOfBranches(bank.getNoOfBranches());
			existingBank.setNoOfStaff(bank.getNoOfStaff());
			existingBank.setStatus(bank.getStatus());
		}
		return bankRepository.save(existingBank);
	}
	//Delete - Delete Bank
	public void deleteBank(long bankId) {
		bankRepository.deleteById(bankId);
	}
	//Get - Get Banks By Status
	public List<Bank> getBanksByStatus(String status) {		
		return bankRepository.findByStatus(status);
	}
	//Get - Get Banks By Profit
	public List<Bank> getBanksByAnnualProfit(double profit) {	
		return bankRepository.findByAnnualProfitGreaterThan(profit);
	}

}
