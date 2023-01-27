import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Java Menghitung Nilai Rata-rata");
        System.out.println("------------------------------------------");
        Scanner input = new Scanner(System.in);
        int[] nilai = {100,20,30,40,50};
        float temp1 = 0;
        float temp2 = 0;
        float nilairata2;

        for (int isi : nilai) {
            temp1 += isi;
        }
        temp2 = nilai.length;

        nilairata2 = temp1/temp2;
        System.out.println("Jadi, nilai rata-ratanya adalah = "+ nilairata2);



    }
}