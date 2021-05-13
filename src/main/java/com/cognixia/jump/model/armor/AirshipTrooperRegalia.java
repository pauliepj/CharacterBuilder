package com.cognixia.jump.model.armor;

import java.util.List;

import com.cognixia.jump.model.Enhancement;
import com.cognixia.jump.model.Equipment;
import com.cognixia.jump.model.enhancements.LightMaterials;

public class AirshipTrooperRegalia implements Equipment{

	public Integer constitutionRequirement;

	public Integer timeToCraft;

	public Integer defenseBonus;
	
	public Integer cost;
	
	public List <Enhancement> enhancements;
	
	LightMaterials lightm =  new LightMaterials();
	
	
	
	public Integer getConstitutionRequirement() {
		return constitutionRequirement;
	}
	

	public void setConstitutionRequirement(Integer constitutionRequirement) {
		this.constitutionRequirement = constitutionRequirement;
	}

	public Integer getTimeToCraft() {
		return timeToCraft;
	}

	public void setTimeToCraft(Integer timeToCraft) {
		this.timeToCraft = timeToCraft;
	}

	public List<Enhancement> getEnhancement() {
		return enhancements;
	}

	public void setEnhancement(List<Enhancement> enhancement) {
		this.enhancements = enhancement;
	}

	public AirshipTrooperRegalia(Integer constitutionRequirement, Integer timeToCraft, Integer defenseBonus, Integer cost, List<Enhancement> enhancement) {
		super();
		enhancement.add(lightm);
		this.enhancements = enhancement;
		this.constitutionRequirement = 14;
		for(int i = 0; i <enhancement.size(); i++) {
			if(enhancement.get(i) == lightm) {
				this.constitutionRequirement --;
			}
		}
		this.timeToCraft = 8;
		this.defenseBonus = 5;
		this.cost = 675;
	}
	
	
}
