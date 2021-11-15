package assis2;

public class Manger extends Employee{
	public double incentive, msal;
    public Manger(double msal ,double incentive)
    {
        this.msal = msal;
        this.incentive = incentive;
    }
    public Manger(int msal2, int incentive2) {
		// TODO Auto-generated constructor stub
	}
	@Override
    public void getTotalSal() {
        System.out.println("Managers total Salary = " + totalmsal());
    }

    public double totalmsal() {
        double totalmsal = msal +incentive;
        return totalmsal;
    }
}
