package com.giz.infoseekdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class Make {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long makeId;
	private String make;
	private String status;
	
//	
//	
//	public Make() {
//		super();
//	}
//	
//	public Make(long makeId, String make, String status) {
//		super();
//		this.makeId = makeId;
//		this.make = make;
//		this.status = status;
//	}
//
//
//
//	public long getMakeId() {
//		return makeId;
//	}
//	public void setMakeId(long makeId) {
//		this.makeId = makeId;
//	}
//	public String getMake() {
//		return make;
//	}
//	public void setMake(String make) {
//		this.make = make;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
	
	
}
