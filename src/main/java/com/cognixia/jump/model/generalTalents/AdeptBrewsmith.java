package com.cognixia.jump.model.generalTalents;

import java.util.List;

import com.cognixia.jump.model.GeneralTalent;

public class AdeptBrewsmith implements GeneralTalent{

	public String description;

	public Integer expCost;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = "you can make one grade 5 potion for free once per day.";
	}

	public Integer getExpCost() {
		return expCost;
	}

	public void setExpCost(Integer expCost) {
		this.expCost = expCost;
	}

	public AdeptBrewsmith(String description, Integer expCost) {
		super();
		this.description = description;
		this.expCost = 90;
	}
	

}
