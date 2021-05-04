import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setFirstName("Kayhan");
		customer1.setLastName("Çetinkaya");
		customer1.set_dateOfBirth(1997);
		customer1.setNationalityId(11111111111l);
		customer1.setId(1);

//Starbucks'ta mernis doðrulama sistemi çalýþýr.Aþaðýda görüldüðü gbi.
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager1.Save(customer1);
//Nero'da mernis kontrolü yoktur.Kendiniz deneyebilirsiniz.
	}

}
