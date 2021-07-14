package core.concretes;

import core.abstracts.ActivationMailService;

import entities.concretes.User;
import linkcontrol.LinkControl;
import linkcontrol.LinkControlManager;

public class ActivationMailManager implements ActivationMailService {

	public ActivationMailManager() {

	}

	@Override
	public void StutusCtrl(User user) {
		if (user.isActivateOfStatus() == true) {
			System.out.println("Kullanýcý aktive durumda");
		}

		else {
			System.out.println("Hesabýnýzý aktive etmek için : www.doðrulabeni.com");
			LinkControl linkControl = new LinkControlManager();
			linkControl.Click();

		}
	}
}
