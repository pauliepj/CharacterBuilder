package com.cognixia.jump.model;

import java.util.List;

import javax.persistence.Entity;

import com.cognixia.jump.model.skills.Athletics;
import com.cognixia.jump.model.skills.Endurance;

@Entity
public class CharacterClass {
	
	Integer characterId;
	String name;
	String race;
	Integer health;
//-----------------------------ATTRIBUTES-------------------
	List<Attribute> attributes;
	
//-----------------------------DEFENSES-------------------
	
	List<Defense> defenses;
	
//------------------------------SKILLS--------------------
	List<Skill> skills;
	
//----------------------------EQUIPMENT------------
	List<Equipment> equipment;
//----------------------------TALENTS--------------
	List<RacialTalent> racialTalents;
	List<GeneralTalent> generalTalents;
	List<CombatTalent> combatTalents;
}
