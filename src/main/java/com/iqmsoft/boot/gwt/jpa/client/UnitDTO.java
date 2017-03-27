package com.iqmsoft.boot.gwt.jpa.client;



public class UnitDTO {

    private String name;
    private String address;
    private String direction;

    private CityDTO city;
    private BankDTO bank;
    
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public void setBank(BankDTO bank) {
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public CityDTO getCity() {
        return city;
    }

    public BankDTO getBank() {
        return bank;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    
}
