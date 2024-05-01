package com.apimoradoresderua.homeless.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PostPersist;

@Entity
public class ParentsTelephone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String number;
	
	private String name;
	
	@JsonIgnore
	@ManyToOne
	private HomelessPersonEntity homelessPersonEntity;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public HomelessPersonEntity getHomelessPersonEntity() {
		return homelessPersonEntity;
	}
	
	public void setHomelessPersonEntity(HomelessPersonEntity homelessPersonEntity) {
		this.homelessPersonEntity = homelessPersonEntity;
	}

	
}
