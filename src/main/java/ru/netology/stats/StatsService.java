package ru.netology.stats;

public class StatsService {
    public long getSumOfAllSales(long[] sales) {   //Сумма всех продаж
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double getAvgSumOfSales(long[] sales) {   //Средняя сумма в месяц
        long sum = getSumOfAllSales(sales);
        int length = 12;
        long average = sum / 12;

        return average;
    }

    public int maxSales(long[] sales) {   //Номер пикового месяца
        int maxMonth = 0;   //номер ячейки в массиве того месяца, в котором были максимальные продажи среди всех уже просмотренных
        int month = 0;   //переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {   //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowAverageSalesM(long[] sales) {   //Кол-во месяцев, в которых продажи были ниже среднего
        int monthCount = 0;
        double avgSum = getAvgSumOfSales(sales);

        for (long sale : sales) {
            if (sale < avgSum) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int moreAverageSalesM(long[] sales) {   //Кол-во месяцев, в которых продажи были выше среднего
        int monthCount = 0;
        double avgSum = getAvgSumOfSales(sales);

        for (long sale : sales) {
            if (sale > avgSum) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }
}
