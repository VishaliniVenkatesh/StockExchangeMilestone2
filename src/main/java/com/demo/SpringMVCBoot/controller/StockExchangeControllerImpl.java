package com.demo.SpringMVCBoot.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.demo.SpringMVCBoot.model.StockExchange;
import com.demo.SpringMVCBoot.service.StockExchangeService;

@Controller
public class StockExchangeControllerImpl implements StockExchangeController{

	
	@Autowired
	private StockExchangeService stockService;
	
	@Override
	public StockExchange insertStock(StockExchange stockExchange) throws SQLException {
		
		return stockService.insertStock(stockExchange);
	}

	@RequestMapping(path="/stockList")
	public ModelAndView getStockList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockList");
		mv.addObject("stockList",stockService.getStockList());
		return mv;
	}
	public static void main(String [] args) {
		StockExchangeController controller=new StockExchangeControllerImpl();
		try {
			System.out.println(controller.getStockList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping(value = "/addStock", method = RequestMethod.GET)
	public String getCompanyForm(ModelMap model) {
		System.out.println("Add New Stock");
		StockExchange s=new StockExchange();
		
		model.addAttribute("stock", s);
		return "insertStock";		
	} 
}
