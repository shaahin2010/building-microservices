package com.gmail.shaahin2010.building.infoservice.buildinginfo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base.TimestampableBaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "bms_unit")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor(staticName = "of")
public class Unit extends TimestampableBaseEntity<Long> {
	private String unitNo;
	private Double area;
	@JoinColumn(nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Building building;
}
