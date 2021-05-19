package com.cognixia.jump.model.martialArts.styles;

import java.util.List;

import com.cognixia.jump.model.MartialArtsStyle;

public class Effsaerae implements MartialArtsStyle{
	
	public String name;
	public String description;
	public List<EffsaeraeAction> actions;
	
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
	public List<EffsaeraeAction> getActions() {
		return actions;
	}
	public void setActions(List<EffsaeraeAction> actions) {
		this.actions = actions;
	}

	public Effsaerae(String name, String description, List<EffsaeraeAction> actions) {
		super();
		this.name = "Effsaerae";
		this.description = "The supreme art of war is to subdue the enemy without fighting.";
		this.actions = actions;
	} 
	
	
}
