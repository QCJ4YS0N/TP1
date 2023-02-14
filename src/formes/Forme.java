package formes;

import exceptions.FormeException;

public abstract class Forme implements Comparable<Forme> {
    public static final Couleur COULEUR_DEFAUT = Couleur.ROUGE;
    public static final int MAX_VAL = 30;
    public static final int MIN_VAL = 1;

    private Couleur couleur;
    private String nom;

    public Forme(String nom) {
        setCouleur(COULEUR_DEFAUT);
        this.nom = nom;
    }

    public abstract int calculerPerimetre();

    public abstract int calculerSurface();

    @Override
    public int compareTo(Forme o) {
        if (nom.equals(o.nom)) {
            return couleur.compareTo(o.couleur);
        }
        return nom.compareTo(o.nom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forme forme = (Forme) o;

        if (nom != null ? !nom.equals(forme.nom) : forme.nom != null) return false;

        return couleur == forme.couleur && calculerSurface() == forme.calculerSurface();
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setCouleur(Couleur couleur) {
        switch (couleur) {
            case BLEU:
            case JAUNE:
            case NOIR:
            case ORANGE:
            case ROUGE:
            case VERT:
            case ROSE:
                this.couleur = couleur;
                break;
        }
    }

    @Override
    public String toString() {
        return nom + " " + couleur + " ";
    }


}
