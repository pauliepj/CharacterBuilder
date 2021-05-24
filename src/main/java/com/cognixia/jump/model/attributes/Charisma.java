package com.cognixia.jump.model.attributes;

import com.cognixia.jump.model.Attribute;

public class Charisma extends Attribute{
	
	public Integer value;
	public Integer expCost;
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Integer getExpCost() {

		return expCost;
	}

	public void setExpCost(Integer expCost) {
		this.expCost = value * 50;
	}

	public Charisma(Integer value, Integer expCost) {
		this.value = value;
		setExpCost(expCost);
	}

}
