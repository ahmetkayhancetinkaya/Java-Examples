package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {

			System.out.println("Validation successfull.");
			super.Save(customer);

		} else {

			System.out.println("Not a valid person.");
		}
	}
}