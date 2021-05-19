package com.cognixia.jump.model.psy;

import java.util.List;

import com.cognixia.jump.model.Discipline;

public class Kinesis implements Discipline{

	public String name;
	public List<KinesisPower> kinesisPowers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<KinesisPower> getKinesisPowers() {
		return kinesisPowers;
	}
	public void setKinesisPowers(List<KinesisPower> kinesisPowers) {
		this.kinesisPowers = kinesisPowers;
	}
	public Kinesis(String name, List<KinesisPower> kinesisPowers) {
		super();
		this.name = "Kinesis";
		this.kinesisPowers = kinesisPowers;
	}
	
}
