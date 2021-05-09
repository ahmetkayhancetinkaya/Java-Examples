package business.concretes;

import java.util.Scanner;

import business.abstracts.UserService;
import core.abstracts.ActivationMailService;
import core.concretes.ActivationMailManager;
import core.concretes.EmailChecker;
import core.concretes.NamesChecker;
import core.concretes.PassChecker;
import dataAccess.abstracts.GeneralDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private GeneralDao generalDao;

	public UserManager(GeneralDao generalDao) {
		super();
		this.generalDao = generalDao;
	}

	@Override
	public void addRule(User user) {
		PassChecker passChecker = new PassChecker();
		NamesChecker namesChecker = new NamesChecker();
		EmailChecker emailChecker = new EmailChecker();

		if (passChecker.PassChk(user) == true & namesChecker.NamesChk(user) == true
				& emailChecker.EmailChk(user) == true) {

			System.out.println("Google ile kayýt için 1'e Alpha ile kayýt için 2'ye basýn:");
			Scanner button = new Scanner(System.in);
			int buttonResult = button.nextInt();

			switch (buttonResult) {
			case 1:
				generalDao.ByGoogle(user);
				break;

			case 2:
				generalDao.addResult(user);
				break;

			default:
				System.out.println("Doðru tuþa basmadýnýz");
			}

			ActivationMailService activationMailService = new ActivationMailManager();
			activationMailService.StutusCtrl(user);

		} else {
			System.out.println("Bilgilerinizi kontrol ediniz!");
			
			System.exit(0);
		}

	}

}
