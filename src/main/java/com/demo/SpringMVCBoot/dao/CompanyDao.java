package com.demo.SpringMVCBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringMVCBoot.model.Company;


public interface CompanyDao extends JpaRepository<Company, Integer>{

	
}
