package com.gmail.shaahin2010.building.infoservice.buildinginfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base.TimestampableBaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "bms_building")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor(staticName = "of")
public class Building extends TimestampableBaseEntity<Long> {
	@Column(length = 50)
	private String buildingName;
	@Column(length = 15)
	private String buildingNo;
	@Column(length = 15, nullable = false, unique = true)
	private String buildingCode;
	private Integer totalFlats;
	@Column(length = 255)
	private String address;

}
