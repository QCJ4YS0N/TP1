package formes;

public class Cercle extends Forme {

    private int rayon;

    public Cercle(String nom, String couleur, int rayon) {
        super(nom, couleur);
        this.rayon = rayon;
    }

    public static boolean rayonEstValide(int rayon) {
        return false;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public int calculerPerimetre() {
        return 0;
    }

    @Override
    public int calculerSurface() {
        return 0;
    }
}
