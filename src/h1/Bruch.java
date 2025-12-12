package h1;

public class Bruch {

    public int zaehler;
    public int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);

        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public void shorten() {
        int g = ggT(zaehler, nenner);
        zaehler /= g;
        nenner /= g;
    }

    public boolean hasSameValueAs(Bruch b) {
        
        return this.zaehler * b.nenner == this.nenner * b.zaehler;
    }
}
