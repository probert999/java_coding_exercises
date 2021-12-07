package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    private int gigasecond = 1000000000;

    private LocalDateTime storedDate = LocalDateTime.now();

    public Exercise004(LocalDate date) {
        storedDate = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        storedDate = dateTime;
    }

    public LocalDateTime getDateTime() {
        LocalDateTime returnDate = storedDate;
        try {
            returnDate = storedDate.plusSeconds(gigasecond);
        }
        catch (Exception exception) {
        }

        return returnDate;
    }
}
