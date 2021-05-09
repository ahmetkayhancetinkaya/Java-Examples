package core.concretes;

import core.abstracts.Checker;
import entities.concretes.User;

public class NamesChecker implements Checker {

 public NamesChecker() {
	 
 }
 
	public boolean NamesChk(User user) {
		if (user.getFirstName().length() >= 2 & user.getLastName().length() >=2 ) {
			return true;
		}
		return false;

}
}