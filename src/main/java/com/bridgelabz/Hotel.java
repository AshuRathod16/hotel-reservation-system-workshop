package com.bridgelabz;

public class Hotel {
    String hotelName;
    Double hotelRates;

    public Hotel(String hotelName, Double hotelRates) {
        this.hotelName = hotelName;
        this.hotelRates = hotelRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Double getHotelRates() {
        return hotelRates;
    }

    public void setHotelRates(Double hotelRates) {
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