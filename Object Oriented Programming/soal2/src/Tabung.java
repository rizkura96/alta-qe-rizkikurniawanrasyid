public class Tabung {

    double r, t;

    public Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }

    public double volumeTabung(){
        return (3.142857142 * this.r * this.r *this.t);
    }
}
