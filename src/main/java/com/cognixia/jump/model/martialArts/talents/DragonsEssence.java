package com.cognixia.jump.model.martialArts.talents;

import com.cognixia.jump.model.martialArts.MartialArtsTalent;

public class DragonsEssence implements MartialArtsTalent{

	public String name;
	public Integer willRequirement;
	public Integer dexRequirement;
	public Integer expCost;
	public String description;
	
	public String getName() {
		return name;
	}

	public Integer getWillRequirement() {
		return willRequirement;
	}
	public void setWillRequirement(Integer willRequirement) {
		this.willRequirement = willRequirement;
	}
	public Integer getDexRequirement() {
		return dexRequirement;
	}
	public void setDexRequirement(Integer dexRequirement) {
		this.dexRequirement = dexRequirement;
	}
	public Integer getExpCost() {
		return expCost;
	}

	public String getDescription() {
		return description;
	}

	public DragonsEssence(String name, Integer willRequirement, Integer dexRequirement, Integer expCost,
			String description) {
		super();
		this.name = "Dragon's Essence";
		this.willRequirement = 5;
		this.dexRequirement = 6;
		this.expCost = 141;
		this.description = "A final explosive strike in the range of your highest Stance's range. "
				+ "Damage is equal to difference between your current health and your maximum health. After you perform this attack, "
				+ "your health drops to 0.";
	}
	
	
	
}
