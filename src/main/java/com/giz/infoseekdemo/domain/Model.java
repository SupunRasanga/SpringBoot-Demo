package com.giz.infoseekdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long makeId;
	private String model;
	private String status;
	@ManyToOne
	private Make modelId;
	
	
//	
//	public Model() {
//		super();
//	}
//	public Model(long makeId, String model, String status, Make modelId) {
//		super();
//		this.makeId = makeId;
//		this.model = model;
//		this.status = status;
//		this.modelId = modelId;
//	}
//	public long getMakeId() {
//		return makeId;
//	}
//	public void setMakeId(long makeId) {
//		this.makeId = makeId;
//	}
//	public String getModel() {
//		return model;
//	}
//	public void setModel(String model) {
//		this.model = model;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public Make getModelId() {
//		return modelId;
//	}
//	public void setModelId(Make modelId) {
//		this.modelId = modelId;
//	}
//	
	
}
