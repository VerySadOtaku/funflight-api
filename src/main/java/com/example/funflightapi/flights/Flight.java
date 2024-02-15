package com.example.funflightapi.flights;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

    @Id
    @GeneratedValue
    private Long id;
    private String airportSourceCountry;
    private String airportSourceCity;
    private String airportTargetCountry;
    private String airportTargetCity;


    public String getAirportSourceCountry() {
        return airportSourceCountry;
    }

    public void setAirportSourceCountry(String airportSourceCountry) {
        this.airportSourceCountry = airportSourceCountry;
    }

    public String getAirportSourceCity() {
        return airportSourceCity;
    }

    public void setAirportSourceCity(String airportSourceCity) {
        this.airportSourceCity = airportSourceCity;
    }

    public String getAirportTargetCountry() {
        return airportTargetCountry;
    }

    public void setAirportTargetCountry(String airportTargetCountry) {
        this.airportTargetCountry = airportTargetCountry;
    }

    public String getAirportTargetCity() {
        return airportTargetCity;
    }

    public void setAirportTargetCity(String airportTargetCity) {
        this.airportTargetCity = airportTargetCity;
    }
}
