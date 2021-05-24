package com.cognixia.jump.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Attribute;

@RestController
public class AttributeController {

	// CRUD methods for each Attribute
	// make new list of attributes, add each one as they are created

	Attribute charisma;
	Attribute con;
	Attribute dex;
	Attribute intel;
	Attribute strength;
	Attribute wis;

	@PostMapping("/attributes/{attributeType}")
	public Attribute createAttribute(@RequestBody Attribute attribute, @PathVariable String attributeType) {
		switch (attributeType) {
		case "Charisma":
			charisma = attribute;
			break;
		case "Strength":
			strength = attribute;
			break;
		case "Wisdom":
			wis = attribute;
			break;
		case "Constitution":
			con = attribute;
			break;
		case "Intelligence":
			intel = attribute;
			break;
		case "Dexterity":
			dex = attribute;
			break;
		default:
			break;

		}
		return attribute; //save
		
	}

	
	
	
	@PatchMapping("/attributes/{attributeType}/{attributeValue}")
	public void updateAttribute(@PathVariable Integer attributeValue, @PathVariable String attributeType) {
		switch (attributeType) {
		case "Charisma":
			charisma.setValue(attributeValue);
			break;
		case "Strength":
			strength.setValue(attributeValue);
			break;
		case "Wisdom":
			wis.setValue(attributeValue);
			break;
		case "Constitution":
			con.setValue(attributeValue);
			break;
		case "Intelligence":
			intel.setValue(attributeValue);
			break;
		case "Dexterity":
			dex.setValue(attributeValue);
			break;
		default:
			break;
		}
	}

}
