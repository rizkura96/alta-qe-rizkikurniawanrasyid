import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang diinginkan = ");
        int angka = input.nextInt();

        kotak(angka);
    }

    private static void kotak(int angka){
        int posisi = 1;
        for (int j=0; j<angka; j++){
            for (int i=0; i<angka; i++) {
                System.out.print(isi(posisi));
                posisi++;
            }
            System.out.println();
        }
    }

    private static char isi(int posisi) {
        char result;
        if (posisi % 3 == 0){
            result = 'X';
        } else if (posisi % 2 == 0) {
            result = 'Z';
        } else {
            result = 'Y';
        }
        return result;
    }

}