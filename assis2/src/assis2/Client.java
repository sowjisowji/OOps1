package assis2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence persistance = new Persistence() {

			@Override
			public void persist() {
				// TODO Auto-generated method stub
			System.out.println("");	
			System.out.println("client created the object of persistence which is abstact class");
			System.out.println("");
			System.out.println("client doing invocation of object method");
			System.out.println("");
			System.out.println("client is invoking the persist method");
			}
			
		};
		persistance.persist();
	}

}
