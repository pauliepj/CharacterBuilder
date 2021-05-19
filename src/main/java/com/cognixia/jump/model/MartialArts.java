package com.cognixia.jump.model;

import java.util.List;

import com.cognixia.jump.model.martialArts.MartialArtsTalent;

public class MartialArts {

	public Integer level;
	public Integer dexRequirement;
	public Integer expCost;
	public List<MartialArtsStyle> styles;
	public List<Impact> impacts;
	public List<RacialStyle> racialStyles;
	public List<MartialArtsTalent> martialArtsTalents;
	
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getDexRequirement() {
		return dexRequirement;
	}

	public Integer getExpCost() {
		return expCost;
	}
	public void setExpCost(Integer expCost) {
		this.expCost = expCost;
	}
	
	public MartialArts(Integer level, Integer dexRequirement, Integer expCost, List<MartialArtsStyle> styles, List<Impact> impacts,
			List<RacialStyle> racialStyles) {
		super();
		this.level = level;
		this.dexRequirement = 3;
		this.expCost = expCost;
		this.styles = styles;
		this.impacts = impacts;
		this.racialStyles = racialStyles;
	}
	
	
	
	
}
