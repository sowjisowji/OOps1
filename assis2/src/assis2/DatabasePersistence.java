package assis2;

public class DatabasePersistence extends Persistence {

	@Override
	public void persist() {
		System.out.println("overriding file persistence");	
	}
	
}
