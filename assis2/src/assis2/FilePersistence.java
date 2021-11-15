package assis2;

public class FilePersistence extends Persistence {

	@Override
	public void persist() {
		System.out.println("overriding file persistence");
	}

}
