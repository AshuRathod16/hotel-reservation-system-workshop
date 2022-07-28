package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.time.LocalDate.*;
import static java.time.format.DateTimeFormatter.*;

public class HotelReservationService {
    static List<Hotel> hotelList = new ArrayList<>();


    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Service");

        Hotel lakewood = new Hotel("Lakewood", 110, 90);
        Hotel bridgewood = new Hotel("Bridgewood", 150, 50);
        Hotel ridgewood = new Hotel("Ridgewood", 220, 150);

        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);
        hotelList.forEach(System.out::println);
        System.out.println(" ");
        cheapestHotelForWeekDays("2022-01-02", "2022-01-03");
        cheapestHotelForWeekend("2020-09-11", "2020-09-12");

    }

    // Method for finding cheap hotel
    public static void cheapestHotelForWeekDays(String startDate, String endDate) {
        LocalDate startDateFormat = parse(startDate, ISO_DATE);
        LocalDate endDateFormat = parse(endDate, ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotel cheapestHotelForWeekDays = hotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRate)).orElse(null);
        System.out.println("Cheapest hotel for weekdays is  :\n" + cheapestHotelForWeekDays);
        System.out.println(cheapestHotelForWeekDays);
        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestHotelForWeekDays.getHotelName());
        hotel.setTotalRates(cheapestHotelForWeekDays.getWeekDayRate() * numberOfDays);
        System.out.println(numberOfDays + "days stayed in hotel");
        System.out.println("Total rate for" + numberOfDays + " days during weekday is :" + hotel.getTotalRates());
        System.out.println(" ");
    }

    public static void cheapestHotelForWeekend(String startDate, String endDate) {
        LocalDate startDateFormat = parse(startDate, ISO_DATE);
        LocalDate endDateFormat = parse(endDate, ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotel cheapestHotelForWeekend = hotelList.stream().min(Comparator.comparing(Hotel::getWeekendRate)).orElse(null);
        System.out.println("Cheapest hotel for weekend is  :\n" + cheapestHotelForWeekend);
        System.out.println(cheapestHotelForWeekend);
        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestHotelForWeekend.getHotelName());
        hotel.setTotalRates(cheapestHotelForWeekend.getWeekendRate() * numberOfDays);
        System.out.println(numberOfDays + "days stayed in hotel");
        System.out.println("Total rate for" + numberOfDays + " days during weekend is :" + hotel.getTotalRates());
    }
}
