package com.cognixia.jump.model.defenses;

import com.cognixia.jump.model.Defense;

public class Reflex implements Defense{
	public Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Reflex(Integer value) {
		super();
		this.value = value;
	}
	
}
