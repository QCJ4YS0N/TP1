package formes;

public abstract class Forme implements Comparable<Forme> {

    private String nom;
    private String couleur;

    public Forme(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public abstract int calculerPerimetre();

    public abstract int calculerSurface();

    public String toString() {
        return nom + couleur + calculerPerimetre() + calculerSurface();
    }

    @Override
    public int compareTo(Forme o) {
        return 1;
    }
}
