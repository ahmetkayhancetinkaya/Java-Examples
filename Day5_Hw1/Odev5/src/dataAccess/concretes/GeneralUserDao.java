package dataAccess.concretes;

import dataAccess.abstracts.GeneralDao;
import entities.concretes.User;

public class GeneralUserDao implements GeneralDao {

	@Override
	public void addResult(User user) {
		System.out.println("ALPHA ile eklendi " + user.getId()+ "-" + user.getFirstName() + " " + user.getLastName() + "-" + user.getEMail());
		// TODO Auto-generated method stub

	}

	@Override
	public void ByGoogle(User user) {
		// TODO Auto-generated method stub
		System.out.println("Google ile eklendi. " +  user.getId()+ "-" + user.getFirstName() + " " + user.getLastName() + "-" + user.getEMail());
	}

}
