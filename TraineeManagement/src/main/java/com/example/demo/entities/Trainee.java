package com.example.demo.entities;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Column;;



@Entity
@Table(name= "trainee")

public class Trainee {
	

	@Id
	
	
	private int traineeid;
	
	@Column
	private String traineename;
	
	@Column
	private String traineedomain;
	
	@Column
	private String traineelocation;

	public int getTraineeid() {
		return traineeid;
	}

	public void setTraineeid(int traineeid) {
		this.traineeid = traineeid;
	}

	public String getTraineename() {
		return traineename;
	}

	public void setTraineename(String traineename) {
		this.traineename = traineename;
	}

	public String getTraineedomain() {
		return traineedomain;
	}

	public void setTraineedomain(String traineedomain) {
		this.traineedomain = traineedomain;
	}

	public String getTraineelocation() {
		return traineelocation;
	}

	public void setTraineelocation(String traineelocation) {
		this.traineelocation = traineelocation;
	}

	public Trainee(int traineeid, String traineename, String traineedomain, String traineelocation) {
		super();
		this.traineeid = traineeid;
		this.traineename = traineename;
		this.traineedomain = traineedomain;
		this.traineelocation = traineelocation;
	}

public Trainee() {
	super();
}
	
	
	
}




