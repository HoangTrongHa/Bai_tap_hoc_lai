package com.example.MyEmployee.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.MyEmployee.entity.Street;


@Repository
public interface StreetRepository extends CrudRepository<Street, Integer>{
	
	List<Street> findByName(String name);
	
	List<Street> findByDistrict(String district);
	
}
