public class Main {
    public static void main(String[] args) {
        System.out.println("Program Java Menghitung Ongkos Kirim sebuah Produk");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Langkah Pertama : Hitung dimensi produk yang akan dikirim.");
        System.out.println("Ket. Panjang = 5cm, Lebar = 2cm, Tinggi = 4cm");
        Dimensi dimensi1 = new Dimensi(5, 2, 4);
        System.out.println("Hasilnya adalah = "+ dimensi1.dimensiproduk());
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Langkah Kedua : Konversi dimensi ke dalam satuan berat");
        Perkondisian perkondisian1 = new Perkondisian(5,2,4);
        System.out.println("Sesuai ketentuan yang ada jika dimensi produk yang dihasilkan adalah 40, maka akan dibulatkan menjadi "+ perkondisian1.syaratPembulatan());
        System.out.println("dan jika sudah dibulatkan menjadi 50cm, maka berat produk akan dikonversi menjadi "+ perkondisian1.konversi()+"kg" );
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Langkah Ketiga : Tentukan Ongkos kirim produknya");
        System.out.println("Ket. Berat per Kg/per 50cm3 = Rp 5000");
        System.out.println("Walaupun dimensi produk yang dihasilkan di bawah 50 cm, tetap saja beratnya dianggap 1 kg karena minimal pembulatan pada berat adalah 1 kg/50cm3");
        System.out.println("=====================================================================");
        System.out.println("Jadi, ongkos kirim dari produk ini adalah sebesar = Rp"+ perkondisian1.ongkirFix());
        System.out.println("---------------------------------------------------------------------");


    }
}