package com.cognixia.jump.model.convictionAspects;

import java.util.List;

import com.cognixia.jump.model.ConvictionAspect;

public class AirAspect implements ConvictionAspect{

	public Integer rank;
	public String omen;
	public String scry;
	public String opposed;
	public String aura;
	public List<airPower> graces;
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getOmen() {
		return omen;
	}
	public void setOmen(String omen) {
		this.omen = omen;
	}
	public String getScry() {
		return scry;
	}
	public void setScry(String scry) {
		this.scry = scry;
	}
	public String getOpposed() {
		return opposed;
	}
	public void setOpposed(String opposed) {
		this.opposed = opposed;
	}
	public String getAura() {
		return aura;
	}
	public void setAura(String aura) {
		this.aura = aura;
	}
	public List<airPower> getPowers() {
		return graces;
	}
	public void setPowers(List<airPower> powers) {
		this.graces = powers;
	}
	public AirAspect(Integer rank, String omen, String scry, String opposed, String aura, List<airPower> powers) {
		super();
		this.rank = rank;
		this.omen = "The character grows small, ethereal wings on their back. They are intangible, "
				+ "passing through any clothing or armor worn by the marshal.";
		this.scry = "Sense the breath of all living things in range."
				+ " uses main action in combat, our of combat it requires 1 minute of meditation and lasts for five minutes";
		this.opposed = "Earth";
		this.aura = "When in range of Marshals of earth, Gravity weighs heavily upon you and Marshals of the air cannot fly. "
				+ "?Your speed is halved and being knocked prone does 1d6 points of fall damage. Your wings droop and appear shriveled.";
		this.graces = powers;
	} 
	
	
	
	
	//also need to make darkness, death, earth, fire, hate, life, light, love, peace, war, and water aspects
}
