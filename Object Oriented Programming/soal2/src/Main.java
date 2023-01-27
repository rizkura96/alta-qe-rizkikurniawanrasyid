public class Main {
    public static void main(String[] args) {
        System.out.println("Program Java Menghitung Volume Kubus");
        System.out.println("Ket. Panjang Sisi = 10cm");
        System.out.println("------------------------------------");
        Kubus kubus1 = new Kubus(10);
        System.out.println("Volume Kubusnya adalah :"+ kubus1.volumeKubus());
        System.out.println("-------------------------------------");

        System.out.println("Program Java Menghitung Volume Balok");
        System.out.println("Ket. Panjang = 6cm, Lebar = 3cm, dan Tinggi = 10cm");
        System.out.println("------------------------------------");
        Balok balok1 = new Balok(6,3,10);
        System.out.println("Volume Baloknya adalah :"+ balok1.volumeBalok());
        System.out.println("-------------------------------------");

        System.out.println("Program Java Menghitung Volume Tabung");
        System.out.println("Ket. r = 7cm dan t = 10cm");
        System.out.println("------------------------------------");
        Tabung tabung1 = new Tabung(7, 10);
        System.out.println("Volume Tabungnya adalah :"+ tabung1.volumeTabung());
        System.out.println("-------------------------------------");

    }
}