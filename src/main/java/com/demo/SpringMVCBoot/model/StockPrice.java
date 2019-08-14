package com.demo.SpringMVCBoot.model;

import java.util.Date;

public class StockPrice {
	private int stockCode;
	private int companyCode;
	private int stockExchangeId;
	private float currentPrice;
	private Date date;
	private Date time;
	public StockPrice()
	{
		
	}
	public StockPrice(int stockCode, int companyCode, int stockExchangeId, float currentPrice, Date date, Date time) {
		super();
		this.stockCode = stockCode;
		this.companyCode = companyCode;
		this.stockExchangeId = stockExchangeId;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public float getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
