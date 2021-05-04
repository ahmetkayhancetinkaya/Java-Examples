import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setFirstName("Kayhan");
		customer1.setLastName("�etinkaya");
		customer1.set_dateOfBirth(1997);
		customer1.setNationalityId(11111111111l);
		customer1.setId(1);

//Starbucks'ta mernis do�rulama sistemi �al���r.A�a��da g�r�ld��� gbi.
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager1.Save(customer1);
//Nero'da mernis kontrol� yoktur.Kendiniz deneyebilirsiniz.
	}

}
