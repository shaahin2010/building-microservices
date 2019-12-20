package com.gmail.shaahin2010.building.infoservice.buildinginfo.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.Unit;

@RepositoryRestResource(collectionResourceRel = "units", path = "units")
public interface UnitRepository extends CrudRepository<Unit, Long>, PagingAndSortingRepository<Unit, Long>,
		QuerydslPredicateExecutor<Unit> {

}
