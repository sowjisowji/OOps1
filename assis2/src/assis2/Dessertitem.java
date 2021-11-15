package assis2;

public abstract class Dessertitem {
	public double tax;
	public Dessertitem(double tax) {
		super();
		this.tax = tax;
	}
	public abstract void getCost();
}
