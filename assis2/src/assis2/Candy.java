package assis2;

public class Candy extends Dessertitem {
public double doller;

public Candy(double tax, double doller) {
	super(tax);
	this.doller = doller;
}

@Override
public void getCost() {
	// TODO Auto-generated method stub
	double price;
	double rupees=60;
	double can=doller/rupees;
	System.out.println("price of candy:"+(price=can+tax)+"doller");
}

}
