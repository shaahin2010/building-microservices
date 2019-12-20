package com.gmail.shaahin2010.building.infoservice.buildinginfo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "bms_unit_event")
@EqualsAndHashCode(callSuper = false)
public class UnitEvent extends BaseEntity<Long> {
	private String unitNo;
	private Double area;
	@JoinColumn(nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Unit unit;
	@Temporal(TemporalType.TIMESTAMP)
	private Date eventDate;

}
