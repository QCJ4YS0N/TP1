/*
420-202 – TP1 – Traitement de données orienté objet
Groupe : 2
Nom : Poirier
Prénom : Jayson
DA : 2243405
*/
package formes;

import exceptions.FormeException;

import java.util.Arrays;

public class Triangle extends Forme {
    private int coteA;
    private int coteB;
    private int coteC;

    public Triangle(int coteA, int coteB, int coteC) throws FormeException {
        super("Triangle");

        if (coteEstValide(coteA) && coteEstValide(coteB) && coteEstValide(coteC)) {
            this.coteA = coteA;
            this.coteB = coteB;
            this.coteC = coteC;
        }
        estTriangle(coteA, coteB, coteC);
    }

    @Override
    public int calculerPerimetre() {
        return coteA + coteB + coteC;
    }

    @Override
    public int calculerSurface() {
        double p = calculerPerimetre() * 0.5;

        return (int) (Math.sqrt((p * ((p - coteA) * (p - coteB) * (p - coteC)))));
    }

    public static boolean coteEstValide(int cote) throws FormeException {
        if (MIN_VAL <= cote && cote <= MAX_VAL) {
            return true;
        }
        throw new FormeException("Le cote : " + cote + "est invalide");
    }

    public boolean estRectangle() {
        int[] cotes = getCotesTries(coteA, coteB, coteC);

        return cotes[2] == Math.sqrt((Math.pow(cotes[0], 2) + Math.pow(cotes[1], 2)));
    }

    public static boolean estTriangle(int a, int b, int c) throws FormeException {
        int[] cotes = getCotesTries(a, b, c);

        if (cotes[2] <= cotes[1] + cotes[0]) {
            return true;
        }
        throw new FormeException("La forme n'est pas un triangle valide");
    }

    public int getCoteA() {
        return coteA;
    }

    public int getCoteB() {
        return coteB;
    }

    public int getCoteC() {
        return coteC;
    }

    private int[] getCotesTries() {
        int[] cotes = {coteA, coteB, coteC};

        Arrays.sort(cotes);
        return cotes;
    }

    private static int[] getCotesTries(int coteA, int coteB, int coteC) {
        int[] cotes = {coteA, coteB, coteC};

        Arrays.sort(cotes);
        return cotes;
    }

    private int getNbrCotesEgaux() {
        int[] cotes = getCotesTries();
        int nbCotesEgaux = 1;

        for (int i = 1; i < 3; i++) {
            if (cotes[i] == cotes[i - 1]) {
                nbCotesEgaux++;
            }
        }
        return nbCotesEgaux;
    }

    public TypeTriangle getType() {
        int nbCotesEgaux = getNbrCotesEgaux();
        TypeTriangle type = TypeTriangle.SCALENE;

        if (estRectangle()) {
            return TypeTriangle.RECTANGLE;
        } else if (nbCotesEgaux == 2) {
            return TypeTriangle.ISOCELE;
        } else if (nbCotesEgaux == 3) {
            return TypeTriangle.EQUILATERAL;
        }
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + getType() + " " + coteA + " " + coteB + " " + coteC;
    }
}
