package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate today = LocalDate.now();
        LocalDate fullMoon = LocalDate.of(2018,9,24); //The nearest date at time of writing

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy"); // Formatting
        String textToday = today.format(dtf);
        String textFullMoon = fullMoon.format(dtf);

        System.out.println("Today is " + textToday);

        while(today.isAfter(fullMoon)){ // if today is after the initialized date of the full moon, keep adding 29 days until next full moon
            fullMoon.plusDays(29);
        }

        System.out.println("the next full moon is at " + textFullMoon);
    }
}
