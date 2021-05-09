

import business.abstracts.UserService;
import business.concretes.UserManager;

import dataAccess.concretes.GeneralUserDao;
import entities.concretes.SýngInUserInfo;
import entities.concretes.User;


public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new GeneralUserDao());

		User user = new User(1, "Kayhan", "Çetinkaya", "ahmetkayhanc@gmail.com", "123468", false);
		userService.addRule(user);

		SýngInUserInfo sýngInUserInfo = new SýngInUserInfo(user);
		sýngInUserInfo.SýngIn();
	}

}
