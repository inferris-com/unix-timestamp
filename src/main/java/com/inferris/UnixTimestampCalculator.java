package com.inferris;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import java.util.Scanner;

/**
 * The UnixTimestampCalculator class is a Java program that converts a human-readable date and time into a Unix timestamp.
 * A Unix timestamp represents the number of seconds that have elapsed since January 1, 1970 (Coordinated Universal Time, UTC).
 */
public class UnixTimestampCalculator {

    /**
     * The main method of the UnixTimestampCalculator program.
     * It prompts the user to enter a date and time in the format "yyyy-MM-dd HH:mm:ss",
     * converts it into a Unix timestamp, and displays the result.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date and time (yyyy-MM-dd HH:mm:ss): ");
        String inputDateTime = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("America/New_York")); // Set the time zone to Eastern Time (ET)

        try {
            Date date = sdf.parse(inputDateTime);
            long unixTimestamp = date.getTime() / 1000; // Convert milliseconds to seconds
            System.out.println("Unix Timestamp: " + unixTimestamp);
            scanner.nextLine();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
