package formes;

import exceptions.FormeException;

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
        return 0;
    }

    public static boolean coteEstValide(int cote) throws FormeException {
        if (MIN_VAL <= cote && cote <= MAX_VAL) {
            return true;
        }
        throw new FormeException("Le cote : " + cote + "est invalide");
    }

    public boolean estRectangle() {
        return false;
    }

    public static boolean estTriangle(int a, int b, int c) {
        return false;
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

    }

    private int getNbrCotesEgaux() {

    }


    public String getType() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
