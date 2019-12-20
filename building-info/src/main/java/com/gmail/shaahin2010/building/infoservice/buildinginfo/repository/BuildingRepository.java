package com.gmail.shaahin2010.building.infoservice.buildinginfo.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.Building;

@RepositoryRestResource(collectionResourceRel = "buildings", path = "buildings")
public interface BuildingRepository extends CrudRepository<Building, Long>, PagingAndSortingRepository<Building, Long>,
		QuerydslPredicateExecutor<Building> {

}
