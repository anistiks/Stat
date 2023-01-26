package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    void getAllSales() {   //Сумма всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   //sales - название массива
        long expected = 180;

        long actual = service.getSumOfAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void AverageSalesMonth() {   //Средняя сумма продаж в месяц
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.getAvgSumOfSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesMonth() {   //Номер месяца, в котором был пик продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {   //Номер месяца, в котором был минимум продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void lowMonth() {   //Кол-во месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.lowAverageSalesM(sales);
        assertEquals(expected, actual);
    }

    @Test
    void moreMonth() {   //Кол-во месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.moreAverageSalesM(sales);
        assertEquals(expected, actual);
    }
}
