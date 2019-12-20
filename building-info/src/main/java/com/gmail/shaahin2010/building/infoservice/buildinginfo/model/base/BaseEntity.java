package com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base;

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
public class BaseEntity<ID> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected ID id;

}
