package com.cognixia.jump.model;

public class Attribute {
	public Integer accountId;
	public Integer charisma;//continue for other attributes
	public Integer expCost;
	
	
	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

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

	public Attribute(String attributeType, Integer value, Integer expCost) {
		super();
		this.value = value;
		setExpCost(expCost);
	}

}
