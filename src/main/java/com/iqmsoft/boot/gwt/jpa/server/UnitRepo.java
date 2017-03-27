package com.iqmsoft.boot.gwt.jpa.server;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UnitRepo extends CrudRepository<Unit, Long> {
    
    public List<Unit> findByCityNameOrderByBankName(String cityName);
    
}
