package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long [] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum() {
        long expected = 180;
        long actual = service.sum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAverage() {
        long expected = 15;
        long actual = service.average(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMaxMonth() {
        long expected = 8;
        long actual = service.findMaxMonth(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMinMonth() {
        long expected = 9;
        long actual = service.findMinMonth(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldBelowAverage() {
        long expected = 5;
        long actual = service.monthBelowAverage(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAboveAverage() {
        long expected = 5;
        long actual = service.monthAboveAverage(purchases);
        assertEquals(expected, actual);

    }
}