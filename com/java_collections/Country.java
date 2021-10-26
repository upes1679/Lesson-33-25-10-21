package com.java_collections;

public class Country implements Comparable<Country> {
    private int countryCode;
    private String name;

    @Override
    public String toString() {
        return this.countryCode + " " + this.name;
    }

    public Country(int countryCode, String name) {
        this.countryCode = countryCode;
        this.name = name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(Object o) {
//        Country c = (Country) o;
//        //return this.countryCode - c.countryCode;
//        return  this.name.compareTo(c.name);
//    }

    @Override
    public int compareTo(Country c) {
        return  this.name.compareTo(c.name);
    }

//    Integer
}
