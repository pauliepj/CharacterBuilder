package com.cognixia.jump.model.spells.primaltheurgy;

import com.cognixia.jump.model.spells.Primaltheurgy;

public class ArkaneForce implements Primaltheurgy{
	
	public String name;

	public Integer arkanaLevelRequirement;
	
	public String description;

	public Integer getArkanaLevelRequirement() {
		return arkanaLevelRequirement;
	}

	public void setArkanaLevelRequirement(Integer arkanaLevelRequirement) {
		this.arkanaLevelRequirement = arkanaLevelRequirement;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArkaneForce(String name, Integer arkanaLevelRequirement, String description) {
		super();
		this.name = "Arkane Force";
		this.arkanaLevelRequirement = 1;
		this.description = "adds 1d6 of damage to any spell";
	}
	
	
	
}
