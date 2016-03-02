package laplace;

public class Laplace {

    private double epsilon;
    private double budgetgeneral;
    private boolean testmode;

    public Laplace(double e) {
        this.epsilon = e;
        this.budgetgeneral = this.epsilon;
    }

    public void setTestMode(boolean tm) {
        this.testmode = tm;
    }

    /* X = u - b*signe(U) * ln(1 - 2 |U|) */
    public double genNoise(int sensi, double budget) throws BudgetException{
        double unif = RandomDouble.randomDouble(-0.5, 0.5);
        double b = (sensi / (budget * this.epsilon));
        double laplacevar = -b * Math.signum(unif) * Math.log((1 - 2 * Math.abs(unif)));

        if (!this.testmode) {
            this.budgetgeneral -= budget*this.epsilon;
        }
        if(this.budgetgeneral < 0) throw new BudgetException();
        return laplacevar;
    }

    public double getBudget() {
        return this.budgetgeneral;
    }

    public double getEpsilon() {
        return this.epsilon;
    }

    public void setEpsilon(int e) {
        this.epsilon = e;
    }

    @Override
    public String toString() {
        return "Laplace [epsilon=" + epsilon + ", budget=" + this.budgetgeneral + "]";
    }

}
