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

        Hotel lakewood = new Hotel("Lakewood", 110, 90,200, 3);
        Hotel bridgewood = new Hotel("Bridgewood", 150, 50,200, 4);
        Hotel ridgewood = new Hotel("Ridgewood", 220, 150,370, 5);

        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);
        hotelList.forEach(System.out::println);
        System.out.println(" ");
        cheapestHotelForWeekDays("2022-01-02", "2022-01-03");
        cheapestHotelForWeekend("2020-09-11", "2020-09-12");
        cheapestBestRatedHotel("2020-09-11", "2020-09-12");

    }

    // Method for finding cheapest hotel for week days
    public static void cheapestHotelForWeekDays(String startDate, String endDate) {
        LocalDate startDateFormat = parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = parse(endDate,DateTimeFormatter.ISO_DATE);
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

    // Method for finding hotel cheapest hotel for weekend
    public static void cheapestHotelForWeekend(String startDate, String endDate) {
        LocalDate startDateFormat = parse(startDate,DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = parse(endDate, DateTimeFormatter.ISO_DATE);
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

    // Method for finding cheapest best rated hotel
    public static void cheapestBestRatedHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Hotel cheapestBestRatedHotel = hotelList.stream().filter(n -> n.hotelRatings > 4).min(Comparator.comparing(Hotel::getHotelRatings)).orElse(null);
        System.out.println("Cheapest best rated hotel is :");
        System.out.println(cheapestBestRatedHotel);
        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestBestRatedHotel.getHotelName());
        hotel.setTotalRates(cheapestBestRatedHotel.getWeekendRate() * numberOfDays);
        System.out.println("Total Rate for " + numberOfDays + " day's during weekend is : " + hotel.getTotalRates());
    }
}