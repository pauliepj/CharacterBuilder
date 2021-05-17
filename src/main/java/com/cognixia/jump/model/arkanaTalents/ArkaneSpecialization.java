package com.cognixia.jump.model.arkanaTalents;

import com.cognixia.jump.model.ArkanaTalent;

public class ArkaneSpecialization implements ArkanaTalent{

	public String name;
	public Integer arkanaLevelRequirement;
	public Integer expCost;
	public String description;

	public Integer getArkanaLevelRequirement() {
		return arkanaLevelRequirement;
	}
	public void setArkanaLevelRequirement(Integer arkanaLevelRequirement) {
		this.arkanaLevelRequirement = arkanaLevelRequirement;
	}
	public Integer getExpCost() {
		return expCost;
	}
	public void setExpCost(Integer expCost) {
		this.expCost = expCost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArkaneSpecialization(String name, Integer arkanaLevelRequirement, Integer expCost, String description) {
		super();
		this.name = "Arkane Specialization";
		this.arkanaLevelRequirement = arkanaLevelRequirement;
		this.expCost = expCost;
		this.description = "Choose one school of magic (Primaltheurgy or Necromancy)."
				+ " Gain a +1 to hit die in that school for each level";
	}
	
	
}
