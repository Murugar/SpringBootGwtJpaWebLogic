package com.iqmsoft.boot.gwt.jpa.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface CityRepo extends CrudRepository<City, Long> {

    public List<City> findByCountryId(long id);

}
