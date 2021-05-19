package com.cognixia.jump.model.styles.effsaeraeActions;

public class CounterAttack implements EffsaeraeAction{
	
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
	public CounterAttack(String name, String description) {
		super();
		this.name = "Counter Attack";
		this.description = "Immediately after taking damage, you may make one free hand-to-hand basic attack"
				+ " against the opponent that attacked you. You may do this once per round.";
	}
	
	
	
}
