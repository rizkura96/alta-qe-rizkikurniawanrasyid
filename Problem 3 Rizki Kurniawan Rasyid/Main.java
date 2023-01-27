import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Java Menghitung Jumlah Nilai yang habis dibagi oleh i ke N");
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        int nilai = 6;
        float i;

        System.out.println("-------------");

        for (i=1; i<=nilai; i++) {
            if (6 % i == 0) {
                System.out.println(i);
            }
        }

        System.out.println(" ");
        System.out.println("Jadi bilangan yang dapat dibagi habis oleh nilai 6 adalah 1, 2, 3, dan 6 ");







    }
}