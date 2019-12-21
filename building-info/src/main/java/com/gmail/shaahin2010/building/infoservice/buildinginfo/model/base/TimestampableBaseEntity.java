package com.gmail.shaahin2010.building.infoservice.buildinginfo.model.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@MappedSuperclass
public abstract class TimestampableBaseEntity<ID> extends BaseEntity<ID> {

	@CreatedDate
	@Column(nullable = false, columnDefinition = "timestamp not null default CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date createdDate;

	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastModifiedDate;

	@PrePersist
	public void prePersist() {
		this.createdDate = new Date();
	}

	@PreUpdate
	public void preUpdate() {
		this.lastModifiedDate = new Date();
	}
}
