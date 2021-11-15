package assis2;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Curren currentAcc = new Curren(1000,4000);
	        currentAcc.disp();
	        SavingAcc savingAcc = new SavingAcc(10000,6000);
	        savingAcc.disp();
	        double totalBankBalance = currentAcc.getBalance()+ savingAcc.getBalance();
	        System.out.println("Total Cash in bank = " + totalBankBalance);
	    }
	}

