package com.cognixia.jump.model.spells.primaltheurgy;

import com.cognixia.jump.model.spells.Primaltheurgy;

public class ArkaneArmor implements Primaltheurgy{

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

	public ArkaneArmor(String name, Integer arkanaLevelRequirement, String description) {
		super();
		this.name = "Arkane Armor";
		this.arkanaLevelRequirement = 3;
		this.description = "Grants one defense point in all defenses for 1d4 rounds."
				+ " Can combine with spell attributes "
				+ "'blaze', 'gust', 'evaporate', 'volt', 'earthly burden', or 'snap freeze' "
				+ "and then if the character is hit by a melee the attacker is affected by the combined spell.";
	}
	
}
