package com.cognixia.jump.model;

public class Arkana {
	
	public Integer level;
	
	public Integer expCost;

	public Integer range;
	
	public Integer rangeDefault;
	
	public Integer totalRange;

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getExpCost() {
		return expCost;
	}

	public void setExpCost(Integer expCost) {
		this.expCost = expCost;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public Integer getRangeDefault() {
		return rangeDefault;
	}


	public Integer getTotalRange() {
		return totalRange;
	}

	public void setTotalRange(Integer totalRange) {
		this.totalRange = totalRange;
	}

	public Arkana(Integer level, Integer expCost, Integer range, Integer rangeDefault, Integer totalRange) {
		super();
		this.level = level;
		this.expCost = expCost;
		this.range = range;
		this.rangeDefault = rangeDefault;
		this.totalRange = totalRange;
		//total range needs to be set later in the controller. formula = intelligence value x range = range default.
		//expcost needs to be set later based on what level the character has in arkana.
	}
	
	

	

	
	
}
