package laplace;

import java.util.Random;

public class RandomDouble {

    public static double randomDouble(double min, double max) {
        Random rng = new Random();
        double res = min + (rng.nextDouble() * (max - min));
        return res;
    }

}
