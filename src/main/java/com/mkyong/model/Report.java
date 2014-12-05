package com.mkyong.model;

public class Report {

	private String Date;
	private String Impressions;
	private Integer Clicks;
	private Double Earning;
	
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getImpressions() {
		return Impressions;
	}
	public void setImpressions(String impressions) {
		Impressions = impressions;
	}
	public Integer getClicks() {
		return Clicks;
	}
	public void setClicks(Integer clicks) {
		Clicks = clicks;
	}
	public Double getEarning() {
		return Earning;
	}
	public void setEarning(Double earning) {
		Earning = earning;
	}
	
}