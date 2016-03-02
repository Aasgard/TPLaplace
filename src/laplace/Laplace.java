package laplace;

public class Laplace {
	
	private int epsilon;
	private boolean testMode;
	
	public Laplace(int e){
		this.epsilon = e;
		this.testMode = false;
	}
	
	public double genNoise(int sensi, double propconso){
		return new Double(12.25);
	}
	
	public int getEpsilon(){
		return this.epsilon;
	}
	
	public void setEpsilon(int e){
		this.epsilon = e;
	}

	@Override
	public String toString() {
		return "Laplace [epsilon=" + epsilon + "]";
	}

}
