package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekDayRate;
    int weekendRate;
    int totalRates;
    int hotelRatings;

    public Hotel() {
    }

    public Hotel(String hotelName, int weekDayRate, int weekendRate, int totalRates, int hotelRatings) {
        this.hotelName = hotelName;
        this.weekDayRate = weekDayRate;
        this.weekendRate = weekendRate;
        this.totalRates = totalRates;
        this.hotelRatings = hotelRatings;
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

    public int getHotelRatings() {
        return hotelRatings;
    }

    public void setHotelRatings(int hotelRatings) {
        this.hotelRatings = hotelRatings;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekDayRate=" + weekDayRate +
                ", weekendRate=" + weekendRate +
                ", totalRates=" + totalRates +
                ", hotelRatings=" + hotelRatings +
                '}';
    }
}