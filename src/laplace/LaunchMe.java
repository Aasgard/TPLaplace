package laplace;

import java.util.ArrayList;

public class LaunchMe {

    public static void main(String[] args) {

		/* Taille du tableau */
        int n = 20;
		/* Valeur maximale que pourra atteindre les variables du tableau */
        int m = 13;
		/* Paramètre de confidentialité */
        int espi;

        ArrayList<Integer> integerTab = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            integerTab.add(RandomInt.randInt(0, m));
        }

        System.out.println(integerTab.toString());

        ArrayList<Double> alDoubles = new ArrayList<>();

        for (int j = 0; j < 2000; j++) {
            alDoubles.add(RandomDouble.randomDouble(-0.5, 0.5));
        }

        System.out.print(ALTools.meanAL(alDoubles));

    }

}
