package laplace;

import java.util.ArrayList;
import java.util.Collections;

public class LaunchMe {

    public static void main(String[] args) throws BudgetException{

		/* Taille du tableau */
        int n = 20;
		/* Valeur maximale que pourra atteindre les variables du tableau */
        int m = 20;
		/* Paramètre de confidentialité */
        int epsi;

        ArrayList<Integer> integerTab = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            integerTab.add(RandomInt.randInt(0, m));
        }

        System.out.println(integerTab.toString());

        /*Laplace lplc = new Laplace(0.01);
        System.out.println("Budget restant : " + lplc.getBudget());

        Laplace lplcboucle = new Laplace(0.01);
        while(lplcboucle.getBudget() > 0){
            lplcboucle.genNoise(1, 0.25);
            System.out.println(lplcboucle.toString());
        }*/

        System.out.println(ALTools.getValuesSup(integerTab, (m/2)).toString());
    }


}
