package by.epam.javabasics.ksr1;

public class Task3 {
    public static void main(String[] args) {
        int y1 = 1987;
        int mon1 = 3;
        int y2 = 2019;
        int mon2 = 4;
        int y;
        int m = 0;
        int days = 0;

        int m1 = 31;
        int m2;
        int m3 = 31;
        int m4 = 30;
        int m5 = 31;
        int m6 = 30;
        int m7 = 31;
        int m8 = 31;
        int m9 = 30;
        int m10 = 31;
        int m11 = 30;
        int m12 = 31;

        if ((y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0)) {
            m2 = 29;
        } else {
            m2 = 28;
        }
        if (mon1 == 1) {
            days = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 2) {
            days = m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 3) {
            days = m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 4) {
            days = m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 5) {
            days = m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 6) {
            days = m6 + m7 + m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 7) {
            days = m7 + m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 8) {
            days = m8 + m9 + m10 + m11 + m12;
        }
        if (mon1 == 9) {
            days = m9 + m10 + m11 + m12;
        }
        if (mon1 == 10) {
            days = m10 + m11 + m12;
        }
        if (mon1 == 11) {
            days = m11 + m12;
        }
        if (mon1 == 12) {
            days = m12;
        }
        System.out.println(days);

        for (y = y1 + 1; y <= y2 - 1; y++) {
            if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
                days = days + 366;
            } else {
                days = days + 365;
            }
        }
        System.out.println(days);

        if ((y2 % 4 == 0) && (y2 % 100 != 0) || (y2 % 400 == 0)) {
            m2 = 29;
        } else {
            m2 = 28;
        }

        if (mon2 == 1) {
            days = days + m1;
        }
        if (mon2 == 2) {
            days = days + m1 + m2;
        }
        if (mon2 == 3) {
            days = days + m1 + m2 + m3;
        }
        if (mon2 == 4) {
            days = days + m1 + m2 + m3 + m4;
        }
        if (mon2 == 5) {
            days = days + m1 + m2 + m3 + m4 + m5;
        }
        if (mon2 == 6) {
            days = days + m1 + m2 + m3 + m4 + m5 + m6;
        }
        if (mon2 == 7) {
            days = days + m1 + m2 + m3 + m4 + m5 + m6 + m7;
        }
        if (mon2 == 8) {
            days = days + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8;
        }
        if (mon2 == 9) {
            days = days + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9;
        }
        if (mon2 == 10) {
            days = days + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10;
        }
        if (mon2 == 11) {
            days = days + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11;
        }
        if (mon2 == 12) {
            days = days + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12;
        }
        System.out.println(days);
    }
}

