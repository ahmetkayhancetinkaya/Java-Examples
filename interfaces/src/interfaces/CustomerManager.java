package interfaces;

public class CustomerManager {

	private Logger[] loggers; // Gelen loggerlar için liste oluþturduk
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " eklendi.");
		String message = customer.getFirstName() + " loglandý.";
		
		Utils.runLoggers(loggers, message);
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+ " silindi.");
		String message = customer.getFirstName() + " loglandý.";
		
		Utils.runLoggers(loggers, message);
	}
}


//
 // Ýki tür baðýmlýlýk var
 