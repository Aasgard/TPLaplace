package laplace;

public class Laplace {

    private int epsilon;

    public Laplace(int e) {
        this.epsilon = e;
    }

    /* X = u - b*signe(U) * ln(1 - 2 |U|) */
    public double genNoise(int sensi, double propconso) {
        return new Double(12.25);
    }

    public int getEpsilon() {
        return this.epsilon;
    }

    public void setEpsilon(int e) {
        this.epsilon = e;
    }

    @Override
    public String toString() {
        return "Laplace [epsilon=" + epsilon + "]";
    }

}
