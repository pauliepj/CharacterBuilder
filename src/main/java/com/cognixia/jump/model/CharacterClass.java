package com.cognixia.jump.model;

import java.util.List;
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
	//I could have made each of these have marker interfaces to "Talent"
	//but I chose not to because I think each of these needs their own controller. Because there are a lot of talents.
	
//-----------------------------ARKANA------------------
	Arkana arkana;
	
//---------------------------CONVICTION----------------
	Conviction conviction;
	
//--------------------------MARTIAL ARTS----------------
	MartialArts martialArts;
	
//------------------------------PSY---------------------
	Psy psy;

	
//---------------------------GETTERS & SETTERS-----------	
	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public List<Defense> getDefenses() {
		return defenses;
	}

	public void setDefenses(List<Defense> defenses) {
		this.defenses = defenses;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}

	public List<RacialTalent> getRacialTalents() {
		return racialTalents;
	}

	public void setRacialTalents(List<RacialTalent> racialTalents) {
		this.racialTalents = racialTalents;
	}

	public List<GeneralTalent> getGeneralTalents() {
		return generalTalents;
	}

	public void setGeneralTalents(List<GeneralTalent> generalTalents) {
		this.generalTalents = generalTalents;
	}

	public List<CombatTalent> getCombatTalents() {
		return combatTalents;
	}

	public void setCombatTalents(List<CombatTalent> combatTalents) {
		this.combatTalents = combatTalents;
	}

	public List<StealthTalent> getStealthTalents() {
		return stealthTalents;
	}

	public void setStealthTalents(List<StealthTalent> stealthTalents) {
		this.stealthTalents = stealthTalents;
	}

	public List<SocialTalent> getSocialTalents() {
		return socialTalents;
	}

	public void setSocialTalents(List<SocialTalent> socialTalents) {
		this.socialTalents = socialTalents;
	}

	public List<ArkanaTalent> getArkanaTalents() {
		return arkanaTalents;
	}

	public void setArkanaTalents(List<ArkanaTalent> arkanaTalents) {
		this.arkanaTalents = arkanaTalents;
	}

	public Arkana getArkana() {
		return arkana;
	}

	public void setArkana(Arkana arkana) {
		this.arkana = arkana;
	}

	public Conviction getConviction() {
		return conviction;
	}

	public void setConviction(Conviction conviction) {
		this.conviction = conviction;
	}

	public MartialArts getMartialArts() {
		return martialArts;
	}

	public void setMartialArts(MartialArts martialArts) {
		this.martialArts = martialArts;
	}

	public Psy getPsy() {
		return psy;
	}

	public void setPsy(Psy psy) {
		this.psy = psy;
	}

	public CharacterClass(Integer characterId, String name, String race, Integer health, List<Attribute> attributes,
			List<Defense> defenses, List<Skill> skills, List<Equipment> equipment, List<RacialTalent> racialTalents,
			List<GeneralTalent> generalTalents, List<CombatTalent> combatTalents, List<StealthTalent> stealthTalents,
			List<SocialTalent> socialTalents, List<ArkanaTalent> arkanaTalents, Arkana arkana, Conviction conviction,
			MartialArts martialArts, Psy psy) {
		super();
		this.characterId = characterId;
		this.name = name;
		this.race = race;
		this.health = health;
		this.attributes = attributes;
		this.defenses = defenses;
		this.skills = skills;
		this.equipment = equipment;
		this.racialTalents = racialTalents;
		this.generalTalents = generalTalents;
		this.combatTalents = combatTalents;
		this.stealthTalents = stealthTalents;
		this.socialTalents = socialTalents;
		this.arkanaTalents = arkanaTalents;
		this.arkana = arkana;
		this.conviction = conviction;
		this.martialArts = martialArts;
		this.psy = psy;
	}
	
	
}
