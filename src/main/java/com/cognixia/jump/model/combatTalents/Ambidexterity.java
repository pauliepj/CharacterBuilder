package com.cognixia.jump.model.combatTalents;

import com.cognixia.jump.model.CombatTalent;

public class Ambidexterity implements CombatTalent{
	
	String name;
	String description;
	Integer expCost;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getExpCost() {
		return expCost;
	}
	public void setExpCost(Integer expCost) {
		this.expCost = expCost;
	}
	public Ambidexterity(String name, String description, Integer expCost) {
		super();
		this.name = "Ambidexterity";
		this.description = "character has adapted to using multiple weapons simultaneously";
		this.expCost = expCost;
	}
	
}
