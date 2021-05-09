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

			System.out.println("Google ile kay�t i�in 1'e Alpha ile kay�t i�in 2'ye bas�n:");
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
				System.out.println("Do�ru tu�a basmad�n�z");
			}

			ActivationMailService activationMailService = new ActivationMailManager();
			activationMailService.StutusCtrl(user);

		} else {
			System.out.println("Bilgilerinizi kontrol ediniz!");
			
			System.exit(0);
		}

	}

}
