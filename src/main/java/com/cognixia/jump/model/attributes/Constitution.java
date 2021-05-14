package com.cognixia.jump.model.attributes;

import com.cognixia.jump.model.Attribute;

public class Constitution implements Attribute{
	public Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Constitution(Integer value) {
		super();
		this.value = value;
	}

}
