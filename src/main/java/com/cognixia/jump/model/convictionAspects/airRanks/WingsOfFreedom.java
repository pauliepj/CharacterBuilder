package com.cognixia.jump.model.convictionAspects.airRanks;

import com.cognixia.jump.model.convictionAspects.airPower;

public class WingsOfFreedom implements airPower{

	public String name;
	public String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public WingsOfFreedom(String name, Integer rankRequirement, String description) {
		super();
		this.name = "Wings of Freedom";
		this.description = "Your wings can slow your fall to a safe speed, and you can hover 1 square off the ground."
				+ "While hovering, your speed is halved and you must land at the end of each turn.";
	}
	
	
	
}
