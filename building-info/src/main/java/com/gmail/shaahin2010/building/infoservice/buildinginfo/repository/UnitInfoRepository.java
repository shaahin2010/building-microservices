package com.gmail.shaahin2010.building.infoservice.buildinginfo.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gmail.shaahin2010.building.infoservice.buildinginfo.model.UnitInfo;

@RepositoryRestResource(collectionResourceRel = "unitInfo", path = "unitInfo")
public interface UnitInfoRepository extends CrudRepository<UnitInfo, Long>, PagingAndSortingRepository<UnitInfo, Long>,
		QuerydslPredicateExecutor<UnitInfo> {

}
