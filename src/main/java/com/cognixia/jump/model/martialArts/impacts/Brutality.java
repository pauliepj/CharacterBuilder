package com.cognixia.jump.model.martialArts.impacts;

import java.util.List;

import com.cognixia.jump.model.Impact;

public class Brutality implements Impact{
	
	public String name;
	public String description;
	public List<BrutalityAction> actions;
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<BrutalityAction> getActions() {
		return actions;
	}
	public void setActions(List<BrutalityAction> actions) {
		this.actions = actions;
	}

	public Brutality(String name, String description, List<BrutalityAction> actions) {
		super();
		this.name = "Brutality";
		this.description = "The greatest joy is crushing your enemies";
		this.actions = actions;
	}
	
	

}
