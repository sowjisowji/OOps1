package assis2;

public class Icecream extends Dessertitem {
	public double rupees;

	public Icecream(double tax, double rupees) {
		super(tax);
		this.rupees = rupees;
	}

	@Override
	public void getCost() {
		// TODO Auto-generated method stub
		double price;
		System.out.println("price of icecream:"+(price=rupees+tax)+"rupees");
	}
	
}
