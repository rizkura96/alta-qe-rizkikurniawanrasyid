import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nilai = -5;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai :");
        nilai = input.nextInt();
        String predikat = null;
        if (nilai > 100) {
            predikat = "Invalid";
        }
        else if (nilai < 0){
            predikat = "Invalid";
        }
        else if (nilai >= 80) {
            predikat = "A";
        } else if (nilai >= 65) {
            predikat = "B+";
        } else if (nilai >= 50) {
            predikat = "B";
        } else if (nilai >= 35) {
            predikat = "C";
        } else if (nilai >= 0) {
            predikat = "D";
        }
        System.out.println("Nilai \t\t= "+nilai );
        System.out.println("Predikat \t= "+predikat);

    }
}