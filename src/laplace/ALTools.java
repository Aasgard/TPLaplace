package laplace;

import java.util.ArrayList;

public class ALTools {

    public static double meanAL(ArrayList<Double> input) {

        double somme = 0;
        int i = 0;

        for (double data : input) {
            somme += data;
            i++;
        }

        System.out.println("Taille du tableau analysé : " + input.size());
        System.out.println("Somme du tableau analysé : " + somme);

        return somme / input.size();
    }

}
