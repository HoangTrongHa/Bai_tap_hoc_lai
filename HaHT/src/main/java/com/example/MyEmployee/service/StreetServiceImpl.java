package com.example.MyEmployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyEmployee.entity.Street;
import com.example.MyEmployee.repository.StreetRepository;

@Service
public class StreetServiceImpl implements StreetService{

	@Autowired StreetRepository streetRepository;
	
	@Override
	public Iterable<Street> findAll() {		
		return streetRepository.findAll();
	}

	@Override
	public List<Street> findByDistrict(String district) {
		// TODO Auto-generated method stub
		
		return streetRepository.findByDistrict(district);
	}

	@Override
	public List<Street> findByName(String name) {
		// TODO Auto-generated method stub
		return streetRepository.findByName(name);
	}

	@Override
	public void addStreet(Street street) {
		// TODO Auto-generated method stub
		streetRepository.save(street);
	}

}
