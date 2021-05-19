package com.cognixia.jump.model.martialArts.racialStyles.human;

import com.cognixia.jump.model.martialArts.racialStyles.HumanStyle;

public class Rank4 implements HumanStyle{

	public String description;

	public String getDescription() {
		return description;
	}

	public Rank4(String description) {
		super();
		this.description = "Once per encounter, you may immediately attempt a disarm"
				+ "as a free action if the enemy misses you with a melee attack";
	}
	
	
}
