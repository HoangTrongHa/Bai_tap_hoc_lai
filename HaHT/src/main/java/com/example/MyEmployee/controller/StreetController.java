package com.example.MyEmployee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyEmployee.entity.Street;
import com.example.MyEmployee.service.StreetService;

@RestController
public class StreetController {
	@Autowired StreetService streetService;
	
	@GetMapping("/get-all-street")
	public List<Street> getAllStreet(){
		List<Street> streets = new ArrayList();
		streetService.findAll().forEach(streets::add);
		return streets;
	}
	
	@GetMapping("/get-by-district/{district}")
	public List<Street> getStreetByDistrict( @PathVariable("district") String district){
		List<Street> streets = new ArrayList();		
		streetService.findByDistrict(district).forEach(streets::add);
		return streets;
	}
	
	@GetMapping("/get-by-street/{street}")
	public List<Street> getStreet( @PathVariable("street") String street){
		List<Street> streets = new ArrayList();		
		streetService.findByName(street).forEach(streets::add);
		return streets;
	}
	
	@PostMapping("/add-street")
	public String addStreet(@RequestBody Street street) {		
		streetService.addStreet( street);
		return "done";		
	}
	
	@GetMapping("/get-add-district")
	public List<String> getAllDistrict() {
		List<String> allDistrict = new ArrayList<String>();
		streetService.findAll().forEach(x -> allDistrict.add(x.getDistrict()));
		return allDistrict;		
	}
}
