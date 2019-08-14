package com.demo.SpringMVCBoot.service;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringMVCBoot.dao.CompanyDao;
import com.demo.SpringMVCBoot.model.Company;

@Service
public class CompanyDetailServiceImpl implements CompanyDetailService {

	@Autowired
	private CompanyDao companyDetailsDao;
	
	
	public List<Company> getCompanyDetails() {
		return null;
		
	}

	


	@Override
	public Company insertCompany(Company company) throws SQLException {
		
		int stockCode=25;
		company.setStockCode(stockCode);
		return companyDetailsDao.save(company);
			
	}


	@Override
	public List<Company> getCompanyList() throws SQLException {
		
		return companyDetailsDao.findAll();
	}

	

}
