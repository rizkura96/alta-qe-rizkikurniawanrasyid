public class Segitiga1 {
    double alas;
    double tinggi;

    public Segitiga1(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double luasSegitiga() {
        return (this.alas*this.tinggi/2);
    };
    public double kelilingSegitiga() {
        double a = Math.pow(this.alas, 2);
        double b = Math.pow(this.tinggi, 2);
        double sisi = Math.sqrt(a + b);
        return (this.alas + this.tinggi + sisi);
    }

}

