package com.cognixia.jump.model;

import java.util.List;

public class Conviction {

	public Integer level;
	public Integer convictionPoints;
	public Integer religionRequirement;
	public Integer expCost;
	public Integer rangeDefault;
	public Integer range;
	public List<ConvictionAspect> aspects;
	public List<ConvictionTalent> convictionTalents;
	public List<Miracle> miracles;

	
	public Integer getReligionRequirement() {
		return religionRequirement;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getConvictionPoints() {
		return convictionPoints;
	}

	public void setConvictionPoints(Integer convictionPoints) {
		this.convictionPoints = convictionPoints;
	}

	public Integer getExpCost() {
		return expCost;
	}

	public void setExpCost(Integer expCost) {
		this.expCost = expCost;
	}

	public Integer getRangeDefault() {
		return rangeDefault;
	}

	public void setRangeDefault(Integer rangeDefault) {
		this.rangeDefault = rangeDefault;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public List<ConvictionAspect> getAspects() {
		return aspects;
	}
	
	public void setAspects(List<ConvictionAspect> aspects) {
		this.aspects = aspects;
	}

	public List<ConvictionTalent> getConvictionTalents() {
		return convictionTalents;
	}

	public void setConvictionTalents(List<ConvictionTalent> convictionTalents) {
		this.convictionTalents = convictionTalents;
	}

	public List<Miracle> getMiracles() {
		return miracles;
	}

	public void setMiracles(List<Miracle> miracles) {
		this.miracles = miracles;
	}
	
	public Conviction(Integer level, Integer convictionPoints, Integer religionRequirement, Integer expCost,
			Integer rangeDefault, Integer range, List<ConvictionAspect> aspects,
			List<ConvictionTalent> convictionTalents, List<Miracle> miracles) {
		super();
		this.level = level;
		this.convictionPoints = convictionPoints;
		this.religionRequirement = 3;
		this.expCost = expCost;
		this.rangeDefault = 5;
		this.range = range;
		this.aspects = aspects;
		this.convictionTalents = convictionTalents;
		this.miracles = miracles;
	}



	
	
	

	
}
