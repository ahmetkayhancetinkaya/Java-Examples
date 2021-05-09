package core.concretes;

import core.abstracts.Checker;
import entities.concretes.User;

public class PassChecker implements Checker {

	public PassChecker() {
		// TODO Auto-generated constructor stub
	}

	public boolean PassChk(User user) {
		if (user.getPpassword().length() >= 6) {
			return true;
		}
		return false;

	}

}
