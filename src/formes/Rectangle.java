package formes;

public class Rectangle extends Forme{

    private int hauteur;
    private int largeur;

    public Rectangle(String nom, String couleur, int hauteur, int largeur) {
        super(nom, couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public static boolean hauteurEstValide(int hauteur) {
        return false;
    }

    public static boolean largeurEstValide(int largeur) {
        return false;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
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
