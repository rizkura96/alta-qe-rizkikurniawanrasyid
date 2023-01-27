import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program Java Menghitung Luas dan Keliling Segitiga");
        System.out.println("Ket. Alas = 3cm, Tinggi = 4cm");
        System.out.println("--------------------------------------------------");
        Segitiga1 segitiga1 = new Segitiga1(3, 4);
        System.out.println("Luas Segitiganya adalah :"+ segitiga1.luasSegitiga());
        Segitiga1 segitiga2 = new Segitiga1(3, 4);
        System.out.println("Keliling Segitiganya adalah : "+ segitiga2.kelilingSegitiga());
        System.out.println("--------------------------------------------------");

        System.out.println("Program Java Menghitung Luas dan Keliling Persegi");
        System.out.println("Ket. Panjang atau Lebar = 4 cm");
        Persegi1 persegi1 = new Persegi1(4);
        System.out.println("Luas Perseginya adalah :"+ persegi1.luasPersegi());
        Persegi1 persegi2 = new Persegi1(4);
        System.out.println("Keliling Perseginya adalah :"+ persegi2.kelilingPersegi());
        System.out.println("--------------------------------------------------");

        System.out.println("Program Java Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("Ket. Panjang = 8 cm, Lebar = 7");
        Persegipanjang1 persegipanjang1 = new Persegipanjang1(8,7);
        System.out.println("Luas Persegi Panjangnya adalah :"+ persegipanjang1.luasPersegipanjang());
        Persegipanjang1 persegipanjang2 = new Persegipanjang1(8, 7);
        System.out.println("Keliling Persegi Panjangnya adalah :"+ persegipanjang2.kelilingPersegipanjang());
        System.out.println("--------------------------------------------------");


    }
}