package com.bridgelabz;

public class Hotel {
    String hotelName;
    int hotelNumber;
    int WeekDayRates;
    int WeekendDayRate;

    public Hotel(String hotelName, int hotelNumber, int weekDayRates, int weekendDayRate) {
        this.hotelName = hotelName;
        this.hotelNumber = hotelNumber;
        this.WeekDayRates = weekDayRates;
        this.WeekendDayRate = weekendDayRate;
    }
}