package com.cognixia.jump.model;

import java.util.List;
import javax.persistence.Entity;
@Entity
public class CharacterClass {
	//Each individual category will need it's own controller, at least for talents and Arkana
	//and probably equipment too.
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
	List<StealthTalent> stealthTalents;
	List<SocialTalent> socialTalents;
	List<ArkanaTalent> arkanaTalents;
//-----------------------------Arkana------------------
	Arkana arkana;
	List<Spell> spells;
	
}
