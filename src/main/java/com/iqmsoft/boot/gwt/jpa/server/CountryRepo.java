package com.iqmsoft.boot.gwt.jpa.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CountryRepo extends CrudRepository<Country, Long> {


    public Country findByName(String countryName);

}
