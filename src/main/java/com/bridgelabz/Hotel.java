package com.bridgelabz;

public class Hotel {
    String hotelName;
    Double hotelRates;

    public Hotel(String hotelName, Double hotelRates) {
        this.hotelName = hotelName;
        this.hotelRates = hotelRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelRates=" + hotelRates +
                '}';
    }
}