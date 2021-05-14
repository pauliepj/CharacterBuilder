package com.cognixia.jump.model.skills;

import com.cognixia.jump.model.Skill;

public class Intimidate implements Skill{
	public Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Intimidate(Integer value) {
		super();
		this.value = value;
	}

}
