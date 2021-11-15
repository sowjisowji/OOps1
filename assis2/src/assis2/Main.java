package assis2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manger m = new Manger(25000,1300);
	    System.out.println("Manager Incentive = "+m.incentive);
	     m.getTotalSal();
	    System.out.println();
	    Labour l = new Labour(25000,1500);
	        System.out.println("Labour Overtime incentive = "+l.overTime);
	        l.getTotalSal();
	    System.out.println("");
	    double totalEmpSal = m.totalmsal() + l.ltotallsal();
	    System.out.println("Total Salary of all Employees = " + totalEmpSal);
	}

}
