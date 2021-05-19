package com.cognixia.jump.model;

public class Conviction {

	public Integer level;
	
	public Integer convictionPoints;
	
	public Integer expCost;
	
	public Integer rangeDefault;

	public Integer range;
	
	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getConvictionPoints() {
		return convictionPoints;
	}

	public void setConvictionPoints(Integer convictionPoints) {
		this.convictionPoints = convictionPoints;
	}

	public Integer getExpCost() {
		return expCost;
	}

	public void setExpCost(Integer expCost) {
		this.expCost = expCost;
	}

	public Integer getRangeDefault() {
		return rangeDefault;
	}

	public void setRangeDefault(Integer rangeDefault) {
		this.rangeDefault = rangeDefault;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public Conviction(Integer level, Integer convictionPoints, Integer expCost, Integer rangeDefault, Integer range) {
		super();
		this.level = level;
		this.convictionPoints = convictionPoints;
		this.expCost = expCost;
		this.rangeDefault = 5;
		this.range = range;
	}
	
	

	
}
