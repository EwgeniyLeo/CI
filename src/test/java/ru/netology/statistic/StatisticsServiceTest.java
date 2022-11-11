package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }


    @Test
    void findMaxFirstMonth() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {14, 5, 8, 4, 5, 3, 8, 6, 13, 11, 12};
        long expected = 14;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }


    @Test
    void findMaxLastMonth() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 13, 11, 15};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }


    @Test
    void findMaxNegativeBill() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-12, -5, -8, -4, -5, 0, -8, -6, -13, -11, -15};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}

