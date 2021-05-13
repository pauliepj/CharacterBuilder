package com.cognixia.jump.model.enhancements;

import com.cognixia.jump.model.Enhancement;

public class LightMaterials implements Enhancement{

	@Override
	public String bonus() {
		return "Each investment in light materials reduces the Constitution requirement by 1";
	}

	@Override
	public Integer cost() {
		return 250;
	}
	

}
