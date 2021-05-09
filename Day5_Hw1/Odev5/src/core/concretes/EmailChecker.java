package core.concretes;

import java.util.regex.Pattern;

import core.abstracts.Checker;
import entities.concretes.User;

public class EmailChecker implements Checker {

	public EmailChecker() {

	}

	public boolean EmailChk(User user) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pattern = Pattern.compile(emailRegex);

		if (true == pattern.matcher(user.getEMail()).matches()) {
			return true;
		}

		return false;
	}

}
