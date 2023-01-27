import sun.security.util.Pem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Java Penjumlahan 2 Bilangan");
        System.out.println("Ket. 3 + 4 ");
        System.out.println("-----------------------------------");
        Penjumlahan penjumlahan1 = new Penjumlahan(3,4);
        System.out.println("= "+ penjumlahan1.penjumlahan2Bilangan());
        System.out.println("-----------------------------------");

        System.out.println("Program Java Pengurangan 2 Bilangan");
        System.out.println("Ket. 15 - 4 ");
        System.out.println("-----------------------------------");
        Pengurangan pengurangan1 = new Pengurangan(15,4);
        System.out.println("= "+ pengurangan1.pengurangan2Bilangan());
        System.out.println("-----------------------------------");

        System.out.println("Program Java Perkalian 2 Bilangan");
        System.out.println("Ket. 10 x 10 ");
        System.out.println("-----------------------------------");
        Perkalian perkalian1 = new Perkalian(10,10);
        System.out.println("= "+ perkalian1.perkalian2Bilangan());
        System.out.println("-----------------------------------");

        System.out.println("Program Java Pembagian 2 Bilangan");
        System.out.println("Ket. 12 / 3 ");
        System.out.println("-----------------------------------");
        Pembagian pembagian1 = new Pembagian(12,3);
        System.out.println("= "+ pembagian1.pembagian2Bilangan());
        System.out.println("-----------------------------------");

    }
}