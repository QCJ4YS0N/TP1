/*
420-202 – TP1 – Traitement de données orienté objet
Groupe : 2
Nom : Poirier
Prénom : Jayson
DA : 2243405
*/
package formes;

public enum TypeTriangle {
    EQUILATERAL("équilatéral"),
    ISOCELE("isocèle"),
    RECTANGLE("rectangle"),
    SCALENE("scalène");

    private String type;

    TypeTriangle(String type) {
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getType();
    }
}
