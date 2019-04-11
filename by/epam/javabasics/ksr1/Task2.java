package by.epam.javabasics.ksr1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));
        String line;
        int str;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
//            System.out.println(line);

            Scanner scan = new Scanner(line);
            int sum = 0;
            while (scan.hasNextInt()) {
                str = scan.nextInt();
                sum = sum + str;

            }
            System.out.println("-------");
            System.out.print("| ");
            System.out.print(sum);
            System.out.println(" |");
            System.out.println("-------");
        }
    }
}
