package com.bridgelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.LocalDate.*;


public class HotelReservationService {
    static List<Hotel> hotelList = new ArrayList<>();
    static List<Hotel> specialHotelList = new LinkedList<>();


    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Service");

        Hotel lakewood = new Hotel("Lakewood", 110, 90, 200, 3);
        Hotel bridgewood = new Hotel("Bridgewood", 150, 50, 200, 4);
        Hotel ridgewood = new Hotel("Ridgewood", 220, 150, 370, 5);

        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);
        hotelList.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Special rates for reward customers are: ");
        Hotel lakewoodReward = new Hotel("Lakewood", 80, 80, 160, 3);
        Hotel bridgewoodReward = new Hotel("Bridgewood", 110, 50, 160, 4);
        Hotel ridgewoodReward = new Hotel("Ridgewood", 100, 40, 150, 5);
        specialHotelList.add(lakewoodReward);
        specialHotelList.add(bridgewoodReward);
        specialHotelList.add(ridgewoodReward);
        specialHotelList.forEach(System.out::println);
        cheapestHotelForWeekDays("2022-01-02", "2022-01-03");
        cheapestHotelForWeekend("2020-09-11", "2020-09-12");
        cheapestBestRatedHotel("2020-09-11", "2020-09-12");
        bestRatedHotel("2020-09-11", "2020-09-12");
    }

    // Method for finding cheapest hotel for week days
    public static void cheapestHotelForWeekDays(String startDate, String endDate) {
        LocalDate startDateFormat = parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Optional<Hotel> cheapestHotelForWeekDays = hotelList.stream().sorted(Comparator.comparing(Hotel::getWeekDayRate)).findFirst();
        System.out.println("Cheapest hotel for weekdays is  :\n" + cheapestHotelForWeekDays);
        System.out.println(cheapestHotelForWeekDays);
        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestHotelForWeekDays.get().getHotelName());
        hotel.setTotalRates(cheapestHotelForWeekDays.get().getWeekDayRate() * numberOfDays);
        System.out.println(numberOfDays + "days stayed in hotel");
        System.out.println("Total rate for" + numberOfDays + " days during weekday is :" + hotel.getTotalRates());
        System.out.println(" ");
    }

    // Method for finding the cheapest hotel for weekend
    public static void cheapestHotelForWeekend(String startDate, String endDate) {
        LocalDate startDateFormat = parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Optional<Hotel> cheapestHotelForWeekend = hotelList.stream().sorted(Comparator.comparing(Hotel::getWeekendRate)).findFirst();
        System.out.println("Cheapest hotel for weekend is  :\n" + cheapestHotelForWeekend);
        System.out.println(cheapestHotelForWeekend);
        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestHotelForWeekend.get().getHotelName());
        hotel.setTotalRates(cheapestHotelForWeekend.get().getWeekendRate() * numberOfDays);
        System.out.println(numberOfDays + "days stayed in hotel");
        System.out.println("Total rate for" + numberOfDays + " days during weekend is :" + hotel.getTotalRates());
        System.out.println(" ");
    }

    // Method for finding cheapest best rated hotel
    public static void cheapestBestRatedHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Optional<Hotel> cheapestBestRatedHotel = hotelList.stream().filter(n -> n.hotelRatings > 4).sorted(Comparator.comparing(Hotel::getHotelRatings)).findFirst();
        System.out.println("Cheapest best rated hotel is :");
        System.out.println(cheapestBestRatedHotel);
        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestBestRatedHotel.get().getHotelName());
        hotel.setTotalRates(cheapestBestRatedHotel.get().getWeekendRate() * numberOfDays);
        System.out.println("Total Rate for " + numberOfDays + " days during weekend is : " + hotel.getTotalRates());
        System.out.println(" ");
    }

    // Method for finding best rated hotel
    public static void bestRatedHotel(String startDate, String endDate) {
        LocalDate startDateFormat = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate endDateFormat = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        int numberOfDays = endDateFormat.getDayOfMonth() - startDateFormat.getDayOfMonth();
        Optional<Hotel> bestRatedHotel = hotelList.stream().filter(n -> n.hotelRatings > 4).sorted(Comparator.comparing(Hotel::getHotelRatings)).findFirst();
        System.out.println("Best rated Hotel is :");
        System.out.println(bestRatedHotel);
        Hotel hotels = new Hotel();
        hotels.setHotelName(bestRatedHotel.get().getHotelName());
    }
}