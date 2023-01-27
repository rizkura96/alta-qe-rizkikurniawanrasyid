public class Perkondisian extends Dimensi {
    int dimensiPembulatan, hasil, berat;


    public Perkondisian(int panjang, int lebar, int tinggi) {
        super(panjang, lebar, tinggi);
    }

    public int syaratPembulatan(){

        if ((this.panjang*this.lebar*this.tinggi)==40){dimensiPembulatan=50;
        }
        return dimensiPembulatan;
    }
    public int konversi() {
        if(dimensiPembulatan==50) {
            berat=1;
        }
        return berat;

    }

    public int ongkirFix() {
        return (berat * 5000);
    }
}
