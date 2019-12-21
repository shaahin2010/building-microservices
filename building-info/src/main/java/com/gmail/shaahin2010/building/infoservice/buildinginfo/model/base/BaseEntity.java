package com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@MappedSuperclass
@EqualsAndHashCode(of = "id")
public abstract class BaseEntity<ID> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected ID id;

	@Column(nullable = false)
	protected Boolean active = false;
}
