package interfaces;

public class CustomerManager {

	private Logger[] loggers; // Gelen loggerlar i�in liste olu�turduk
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " eklendi.");
		String message = customer.getFirstName() + " logland�.";
		
		Utils.runLoggers(loggers, message);
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+ " silindi.");
		String message = customer.getFirstName() + " logland�.";
		
		Utils.runLoggers(loggers, message);
	}
}


//
 // �ki t�r ba��ml�l�k var
 