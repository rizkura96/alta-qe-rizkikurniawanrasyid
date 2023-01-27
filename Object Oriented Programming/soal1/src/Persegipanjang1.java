public class Persegipanjang1 {
    int panjang;
    int lebar;

    public Persegipanjang1(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegipanjang() {
        return (this.panjang*this.lebar);
    }
    public int kelilingPersegipanjang() {
        return ((2 * this.panjang)+(2 * this.lebar));
    }
}
