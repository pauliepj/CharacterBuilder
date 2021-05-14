package com.cognixia.jump.model.skills;

import com.cognixia.jump.model.Skill;

public class Dungeoneering implements Skill{
	public Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Dungeoneering(Integer value) {
		super();
		this.value = value;
	}
	
}
