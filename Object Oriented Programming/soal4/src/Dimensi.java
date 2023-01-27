public class Dimensi {
    int panjang, lebar, tinggi;

    public Dimensi(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;

    }
    public int dimensiproduk(){
        int hasil = (this.panjang*this.lebar*tinggi);


        return hasil;
    }

}
