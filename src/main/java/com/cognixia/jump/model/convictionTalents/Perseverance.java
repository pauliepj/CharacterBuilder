package com.cognixia.jump.model.convictionTalents;

import com.cognixia.jump.model.ConvictionTalent;

public class Perseverance implements ConvictionTalent{

	public String name;
	public Integer convictionRequirement;
	public Integer expCost;
	public String description;
	
	public String getName() {
		return name;
	}
	public Integer getConvictionRequirement() {
		return convictionRequirement;
	}
	public Integer getExpCost() {
		return expCost;
	}
	public String getDescription() {
		return description;
	}
	
	public Perseverance(String name, Integer convictionRequirement, Integer expCost, String description) {
		super();
		this.name = "Perseverance";
		this.convictionRequirement = 5;
		this.expCost = 67;
		this.description = "Once per battle, if your health falls below 0, revive with 5 HP.";
	}

	
	
	
}
