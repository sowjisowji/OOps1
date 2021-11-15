package assis2;

public class Labour extends Employee {
	public double ovwerTime,lsal;
	public String overTime;
	public Labour(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public void labour(double lsal,double ovwerTime)
	{
		this.lsal=lsal;
		this.ovwerTime=ovwerTime;
	}
	@Override
	public void getTotalSal() {
		// TODO Auto-generated method stub
		
	}
	public double ltotallsal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
