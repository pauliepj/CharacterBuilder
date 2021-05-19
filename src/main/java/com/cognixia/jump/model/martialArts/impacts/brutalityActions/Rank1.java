package com.cognixia.jump.model.martialArts.impacts.brutalityActions;

import com.cognixia.jump.model.martialArts.impacts.BrutalityAction;

public class Rank1 implements BrutalityAction{

	public String description;

	public String getDescription() {
		return description;
	}

	public Rank1(String description) {
		super();
		this.description = "After doing damage to an enemy, gain a bonus of your total Strength to your hit and damage for the next offensive action."
				+ "This does not stack and resets after the bonus has been applied";
	}

	
	
	
	
}
