package assis2;

public class Curren extends Bank {
	public double creditCash;
    Curren(double balance ,double creditCash)
    {
        super(balance);
        this.creditCash = creditCash;
    }
    @Override
    public double getBalance()
    {
        double currentBalance = balance + creditCash;
        return currentBalance;
    }
    public void disp()
    {
        System.out.println("Initial Balance = " + balance);
        System.out.println("Credit cash = " +  creditCash);
        System.out.println(" Total Current Account Holder Balance= "+getBalance());
        System.out.println("");
    }

}
