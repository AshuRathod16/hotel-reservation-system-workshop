package com.bridgelabz;

import java.util.ArrayList;

public class HotelReservationService {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Management Service");

        ArrayList<Hotel> hotelArrayList = new ArrayList<>();
        Hotel hotel = new Hotel("Lakewood", 1, 110, 90);
        Hotel hotel1 = new Hotel("Bridgewood", 2, 160, 60);
        Hotel hotel2 = new Hotel("Ridgewood", 3, 220, 150);

        hotelArrayList.add(hotel);
        hotelArrayList.add(hotel1);
        hotelArrayList.add(hotel2);
        System.out.println(hotelArrayList);
    }
}
