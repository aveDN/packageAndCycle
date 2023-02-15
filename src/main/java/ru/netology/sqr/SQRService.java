package ru.netology.sqr;

public class SQRService {

    public int sqrInterval(int min, int max) {
        int sum = 0;

        for (int c = 1; c <= 100; c++) {
            if (c * c >= min && c * c <= max) {
                sum++;

            }
        }
        return sum;
    }
}

