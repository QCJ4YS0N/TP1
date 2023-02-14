package formes;

import java.util.Locale;

public enum Couleur {
    BLEU,
    JAUNE,
    NOIR,
    ORANGE,
    ROUGE,
    VERT,
    ROSE;

    public String getNom() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return getNom();
    }
}
