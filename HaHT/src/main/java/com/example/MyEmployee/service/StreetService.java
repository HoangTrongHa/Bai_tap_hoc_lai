package com.example.MyEmployee.service;

import java.util.List;

import com.example.MyEmployee.entity.Street;

public interface StreetService {

	Iterable<Street> findAll();
	
	List<Street> findByDistrict(String district);
	
	List<Street> findByName(String name);
	
	void addStreet(Street street);
}
