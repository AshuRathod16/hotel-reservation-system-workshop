package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservationService {
    static Hotel hotelOne;
    static Hotel hotelTwo;
    static Hotel hotelThree;


    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Service");
        try {
            ArrayList<Hotel> hotelList = new ArrayList<>();
            hotelOne = new Hotel("Lakewood", 110.0);
            hotelTwo = new Hotel("Bridgewood", 160.0);
            hotelThree = new Hotel("Ridgewood", 220.0);

            hotelList.add(hotelOne);
            hotelList.add(hotelTwo);
            hotelList.add(hotelThree);
            System.out.println(hotelList);
            cheapestHotel();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void cheapestHotel() {
        if (hotelOne.getHotelRates() < hotelTwo.getHotelRates() && hotelOne.getHotelRates() < hotelThree.getHotelRates()) {
            System.out.println("Cheapest Hotel is: " + hotelOne.getHotelName() + " " + hotelOne.getHotelRates());
        } else if (hotelTwo.getHotelRates() < hotelThree.getHotelRates() && hotelTwo.getHotelRates() < hotelOne.getHotelRates()) {
            System.out.println("Cheapest Hotel is: " + hotelTwo.getHotelName() + " " + hotelTwo.getHotelRates());
        } else {
            System.out.println("Cheapest Hotel is: " + hotelThree.getHotelName() + " " + hotelThree.getHotelRates());
        }
    }
}


