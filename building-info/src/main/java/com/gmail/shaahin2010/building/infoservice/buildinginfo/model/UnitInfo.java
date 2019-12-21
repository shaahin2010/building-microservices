package com.gmail.shaahin2010.building.infoservice.buildinginfo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base.TimestampableBaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "bms_unit_info")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor(staticName = "of")
public class UnitInfo extends TimestampableBaseEntity<Long> {
	@Column(length = 100)
	private String ownerName;
	@Column(length = 10)
	private String ownerMobile;
	@Column(length = 100)
	private String tenantName;
	@Column(length = 10)
	private String tenantMobile;
	@Column(length = 255)
	private String extraDescription;
	private Boolean rented;
	private Double area;
	@JoinColumn(nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Unit unit;
	@Temporal(TemporalType.TIMESTAMP)
	private Date eventDate;

}
