package com.gmail.shaahin2010.building.infoservice.buildinginfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "bms_building")
@EqualsAndHashCode(callSuper = false)
public class Building extends BaseEntity<Long> {
	@Column(length = 50)
	private String buildingName;
	@Column(length = 15)
	private String buildingNo;
	@Column(length = 15, nullable = false, unique = true)
	private String buildingCode;
	private Integer totalFlats;
	private String address;

}
