package com.example.casestudyapi.Users;

//export type Address = {
//        street: string;
//        suite: string;
//        city: string;
//        zipcode: string;
//        geo: Geo;
//        };

public class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;

    private final Geo geo;

    public Address(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
