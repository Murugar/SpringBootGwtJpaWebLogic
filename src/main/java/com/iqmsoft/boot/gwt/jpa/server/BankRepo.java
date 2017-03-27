package com.iqmsoft.boot.gwt.jpa.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.iqmsoft.boot.gwt.jpa.server.Bank;


@RepositoryRestResource
public interface BankRepo extends CrudRepository<Bank, Long> {
}
