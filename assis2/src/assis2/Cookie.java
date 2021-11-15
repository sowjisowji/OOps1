package assis2;

public class Cookie extends Dessertitem {
	public double euro;

	public Cookie(double tax, double euro) {
		super(tax);
		this.euro = euro;
	}

	public void getCost() {
		// TODO Auto-generated method stub
		double price;
		double rupees=70;
		double can=euro/rupees;
		System.out.println("price of cookie:"+(price=can+tax)+"euro");	
	}
	
}
