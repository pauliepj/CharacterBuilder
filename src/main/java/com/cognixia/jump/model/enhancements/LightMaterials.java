package com.cognixia.jump.model.enhancements;

import com.cognixia.jump.model.Enhancement;

public class LightMaterials implements Enhancement{

	public String name;
	
	@Override
	public String bonus() {
		return "Each investment in light materials reduces the Constitution requirement by 1";
	}

	@Override
	public Integer cost() {
		return 250;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Light Materials";
	}
	

}
