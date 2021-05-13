package com.cognixia.jump.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Character {
	
	Integer characterId;
	String race;
//-----------------------------ATTRIBUTES-------------------
	Integer strength;
	Integer constitution;
	Integer dexterity;
	Integer intelligence;
	Integer wisdom;
	Integer charisma;
//-------------------------------STATS------------------------
	Integer health;
//-----------------------------DEFENSES-------------------
	Integer armorClass;
	Integer fortitude;
	Integer reflex;
	Integer will;
	
//------------------------------SKILLS--------------------
	//Strength based
	Integer athletics;
	
	//Constitution based
	Integer endurance;
	
	//Dex based
	Integer acrobatics;
	Integer stealth;
	Integer thievery;
	
	//Intelligence based
	Integer arcana;
	Integer history;
	Integer religion;
	
	//Wisdom based
	Integer dungeoneering;
	Integer heal;
	Integer insight;
	Integer nature;
	Integer perception;
	
	//Charisma based
	Integer bluff;
	Integer diplomacy;
	Integer intimidate;
	Integer streetwise;
	
//----------------------------EQUIPMENT------------
	List<Equipment> equipment;
	
//----------------------------TALENTS--------------
	List<RacialTalent> racialTalents;
}
