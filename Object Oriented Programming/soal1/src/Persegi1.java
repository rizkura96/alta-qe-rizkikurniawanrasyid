public class Persegi1 {
    int sisi;

    public Persegi1(int sisi) {
        this.sisi = sisi;
    }
    public int luasPersegi() {
        return (this.sisi*this.sisi);
    }
    public int kelilingPersegi(){
        return (4 * this.sisi);
    }
}
