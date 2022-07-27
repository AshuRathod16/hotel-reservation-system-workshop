package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservationService {
    static Hotel hotelOne;
    static Hotel hotelTwo;
    static Hotel hotelThree;


    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Service");

        ArrayList<Hotel> hotelList = new ArrayList<>();
        hotelOne = new Hotel("Lakewood", 110, 90);
        hotelTwo = new Hotel("Bridgewood", 150, 50);
        hotelThree = new Hotel("Ridgewood", 220, 150);

        hotelList.add(hotelOne);
        hotelList.add(hotelTwo);
        hotelList.add(hotelThree);
        System.out.println(hotelList);

    }
}


