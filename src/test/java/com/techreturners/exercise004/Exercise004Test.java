package com.techreturners.exercise004;

import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class Exercise004Test {

  @Test
  public void checkGetDateTimeWhenDateIsSpecified() {

    Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
    LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
    LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
    LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedIncludingNanoseconds() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.of(1970, Month.JANUARY, 1, 0, 0, 0, 500));
    LocalDateTime expected = LocalDateTime.of(2001, Month.SEPTEMBER, 9, 1, 46, 40, 500);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeUsingDateInTheFuture() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.of(2999, Month.FEBRUARY, 13, 13, 13, 13, 0));
    LocalDateTime expected = LocalDateTime.of(3030, Month.OCTOBER, 23, 14, 59, 53, 0);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeUsingBeginningofTime() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.of(0, Month.JANUARY, 1, 0, 0, 0, 0));
    LocalDateTime expected = LocalDateTime.of(31, Month.SEPTEMBER, 9, 1, 46, 40, 0);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeUsingNegativeDateTime() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.of(-1, Month.JANUARY, 1, 0, 0, 0, 0));
    LocalDateTime expected = LocalDateTime.of(30, Month.SEPTEMBER, 9, 1, 46, 40, 0);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeUsingMaxDate() {

    Exercise004 ex004 = new Exercise004(LocalDate.MAX);
    LocalTime expectedTime = LocalTime.of(0, 0, 0);
    LocalDateTime expected = LocalDateTime.of(LocalDate.MAX, expectedTime);

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeUsingMaxDateTime() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.MAX);
    LocalDateTime expected = LocalDateTime.MAX;

    assertEquals(expected, ex004.getDateTime());
  }

  @Test
  public void checkGetDateTimeTwice() {

    Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
    LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

    assertEquals(expected, ex004.getDateTime());
    assertEquals(expected, ex004.getDateTime());
  }
}
