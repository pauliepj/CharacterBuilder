
package com.cognixia.jump.model.miracles;

import com.cognixia.jump.model.Miracle;

public class Dehex implements Miracle{
	
	
	public String name;
	public Integer rankRequirement;
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
	
	public Integer getRankRequirement() {
		return rankRequirement;
	}
	public void setRankRequirement(Integer rankRequirement) {
		this.rankRequirement = rankRequirement;
	}
	public Dehex(String name, Integer rankRequirement, String description) {
		super();
		this.name = "Dehex";
		this.rankRequirement = 1;
		this.description = "A marshal may remove a curse currently afflicting a character within range.";
	}
	
	
}
