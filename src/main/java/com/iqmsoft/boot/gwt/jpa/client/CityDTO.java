package com.iqmsoft.boot.gwt.jpa.client;




public class CityDTO {

    private String name;
    private CountryDTO country;


    //@JoinColumn(name = "COUNTRY_ID")
    public CountryDTO getCountry(){
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }


}
