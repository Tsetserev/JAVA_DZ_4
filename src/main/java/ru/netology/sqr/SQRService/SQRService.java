package ru.netology.sqr.SQRService;

public class SQRService {

    public int calcSQR(int x, int y) {

        int z = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                z = z + 1;
                continue;
            }
        }
        return z;
    }
}
