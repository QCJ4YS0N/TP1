package formes;

import exceptions.FormeException;

public class Cercle extends Forme {
    private int rayon;

    public Cercle(int rayon) throws FormeException {
        super("Cercle");
        setRayon(rayon);
    }

    @Override
    public int calculerPerimetre() {
        return (int) (2 * Math.PI * rayon);
    }

    @Override
    public int calculerSurface() {
        return (int) (Math.PI * Math.pow(rayon, 2));
    }

    public int getRayon() {
        return rayon;
    }

    public static boolean rayonEstValide(int rayon) {
        return MIN_VAL <= rayon && rayon <= MAX_VAL;
    }

    public void setRayon(int rayon) throws FormeException {
        if (rayonEstValide(rayon)) {
            this.rayon = rayon;
        }
        throw new FormeException();
    }

    @Override
    public String toString() {
        return super.toString() + rayon;
    }
}
