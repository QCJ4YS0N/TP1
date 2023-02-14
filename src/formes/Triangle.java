package formes;

public class Triangle extends Forme {

    private int coteA;
    private int coteB;
    private int coteC;


    public Triangle(String nom, String couleur, int coteA, int coteB, int coteC) {
        super(nom, couleur);
        this.coteA = coteA;
        this.coteB = coteB;
        this.coteC = coteC;
    }

    public String getType() {
        return null;
    }

    public boolean estRectangle() {
        return false;
    }

    public static boolean estTriangle(int a, int b, int c) {
        return false;
    }

    public static boolean coteEstValide(int cote) {
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

    @Override
    public int calculerPerimetre() {
        return 0;
    }

    @Override
    public int calculerSurface() {
        return 0;
    }
}
