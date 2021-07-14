

import business.abstracts.UserService;
import business.concretes.UserManager;

import dataAccess.concretes.GeneralUserDao;
import entities.concretes.S�ngInUserInfo;
import entities.concretes.User;


public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new GeneralUserDao());

		User user = new User(1, "Kayhan", "�etinkaya", "ahmetkayhanc@gmail.com", "123468", false);
		userService.addRule(user);

		S�ngInUserInfo s�ngInUserInfo = new S�ngInUserInfo(user);
		s�ngInUserInfo.S�ngIn();
	}

}
