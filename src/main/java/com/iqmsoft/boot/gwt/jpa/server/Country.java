package com.iqmsoft.boot.gwt.jpa.server;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;


@Entity
public class Country extends AbstractPersistable<Long> {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
