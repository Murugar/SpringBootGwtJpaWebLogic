package com.iqmsoft.boot.gwt.jpa.server;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;


@Entity
public class Bank extends AbstractPersistable<Long> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

