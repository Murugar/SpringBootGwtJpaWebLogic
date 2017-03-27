package com.iqmsoft.boot.gwt.jpa.server;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class City extends AbstractPersistable<Long> {

    private String name;
    @ManyToOne
    private Country country;


    //@JoinColumn(name = "COUNTRY_ID")
    public Country getCountry(){
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


}
