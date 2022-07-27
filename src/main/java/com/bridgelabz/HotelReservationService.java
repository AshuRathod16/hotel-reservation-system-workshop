package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservationService {

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Service");

        ArrayList<Hotel> hotelList = new ArrayList<>();
        Hotel hotel  = new Hotel("Lakewood", 110.0);
        Hotel hotel1 = new Hotel("Bridgewood", 160.0);
        Hotel hotel2 = new Hotel("Ridgewood", 220.0);

        hotelList.add(hotel);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        System.out.println(hotelList);
    }
}


