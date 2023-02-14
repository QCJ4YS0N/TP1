package formes;

import exceptions.FormeException;

public class Tests_Rapides {
    public static void main(String[] args) {
        Cercle c = null;
        try {
            c = new Cercle(5);
        } catch (FormeException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c);
    }
}
