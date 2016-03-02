package laplace;

import java.util.ArrayList;
import java.util.Collections;

public class ALTools {

    public static double meanAL(ArrayList<Double> input) {

        double somme = 0;
        int i = 0;
        int pos = 0, neg = 0;

        for (double data : input) {
            if (Math.signum(data) > 0) {
                pos++;
            } else {
                neg++;
            }
            somme += data;
            i++;
        }

        System.out.println("Taille du tableau analysé : " + input.size());
        System.out.println("Somme du tableau analysé : " + somme);
        System.out.println(pos + " nombres positifs \n " + neg + " nombres négatifs");

        return somme / input.size();
    }

    public static int range(ArrayList<Integer> al) {
        Collections.sort(al);
        return al.get(al.size() - 1) - al.get(0);
    }

}
