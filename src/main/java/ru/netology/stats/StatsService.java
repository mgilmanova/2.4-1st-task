package ru.netology.stats;

public class StatsService {
    public long sum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = purchase + sum;
        }

        return sum;
    }

    public long average(long[] purchases) {
        long sum = sum(purchases);
        return sum / purchases.length;
    }

    public long findMaxMonth(long[] purchases) {
        long max = findMax(purchases);
        int monthNumber = 0;
        int monthNumberWithMax = 0;
        for (long purchase : purchases) {
            monthNumber += 1;
            if (purchase == max) {
                monthNumberWithMax = monthNumber;
            }
        }
        return monthNumberWithMax;
    }
    public long findMinMonth(long[] purchases) {
        long min = findMin(purchases);
        int monthNumber = 0;
        int monthNumberWithMin = 0;
        for (long purchase : purchases) {
            monthNumber += 1;
            if (purchase == min) {
                monthNumberWithMin = monthNumber;
            }
        }
        return monthNumberWithMin;
    }
    public long findMax(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }

    public long findMin(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

    public long monthBelowAverage(long[] purchases) {
        long average = average(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                count += 1;
            }
        }

        return count;
    }

    public long monthAboveAverage(long[] purchases) {
        long average = average(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                count += 1;
            }
        }

        return count;
    }
}
