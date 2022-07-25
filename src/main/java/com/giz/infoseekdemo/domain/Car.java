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
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long carId;
	private String engineNo;
	private String chassieNo;
	private String status;
	private long yom;
	@ManyToOne
	private Model modelId;
	
	
//	public Car() {
//		super();
//	}
//	public Car(long carId, String engineNo, String chassieNo, String status, long yom, Model modelId) {
//		super();
//		this.carId = carId;
//		this.engineNo = engineNo;
//		this.chassieNo = chassieNo;
//		this.status = status;
//		this.yom = yom;
//		this.modelId = modelId;
//	}
//	public long getCarId() {
//		return carId;
//	}
//	public void setCarId(long carId) {
//		this.carId = carId;
//	}
//	public String getEngineNo() {
//		return engineNo;
//	}
//	public void setEngineNo(String engineNo) {
//		this.engineNo = engineNo;
//	}
//	public String getChassieNo() {
//		return chassieNo;
//	}
//	public void setChassieNo(String chassieNo) {
//		this.chassieNo = chassieNo;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public long getYom() {
//		return yom;
//	}
//	public void setYom(long yom) {
//		this.yom = yom;
//	}
//	public Model getModelId() {
//		return modelId;
//	}
//	public void setModelId(Model modelId) {
//		this.modelId = modelId;
//	}
//	
	
}
