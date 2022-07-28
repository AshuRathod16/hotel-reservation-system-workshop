package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekDayRate;
    int weekendRate;
    int totalRates;

    public Hotel(String hotelName, int weekDayRate, int weekendRate) {
        this.hotelName = hotelName;
        this.weekDayRate = weekDayRate;
        this.weekendRate = weekendRate;

    }

    public Hotel() {

    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    public int getTotalRates() {
        return totalRates;
    }

    public void setTotalRates(int totalRates) {
        this.totalRates = totalRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRate=" + weekDayRate +
                ", weekendRate=" + weekendRate +
                ", totalRates=" + totalRates +
                '}';
    }
}