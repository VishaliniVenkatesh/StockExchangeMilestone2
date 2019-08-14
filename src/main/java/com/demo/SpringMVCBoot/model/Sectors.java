package com.demo.SpringMVCBoot.model;

public class Sectors {
	private int sectorId;
	private String sectorName;
	private String brief;
	public Sectors()
	{
		
	}
	public Sectors(int sectorId, String sectorName, String brief) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.brief = brief;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	
}
