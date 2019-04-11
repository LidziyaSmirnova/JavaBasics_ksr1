package by.epam.javabasics.ksr1;

public class Task1 {
    public static void main(String[] args) {
        int i = 1;
        double max = 0;
        double min = 0;
        while (i <= 100) {
            double a = Math.random() * 200 - 100;
            System.out.println(a);
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            i++;
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
