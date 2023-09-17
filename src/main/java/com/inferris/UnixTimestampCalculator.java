package com.inferris;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import java.util.Scanner;

public class UnixTimestampCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date and time (yyyy-MM-dd HH:mm:ss): ");
        String inputDateTime = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York")); // Set the time zone to Eastern Time (ET)

        try {
            Date date = sdf.parse(inputDateTime);
            long unixTimestamp = date.getTime() / 1000; // Convert milliseconds to seconds
            System.out.println("Unix Timestamp: " + unixTimestamp);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            scanner.close();

            //test commit
        }
    }
}
