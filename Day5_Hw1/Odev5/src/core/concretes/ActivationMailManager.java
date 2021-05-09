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
			System.out.println("Kullan�c� aktive durumda");
		}

		else {
			System.out.println("Hesab�n�z� aktive etmek i�in : www.do�rulabeni.com");
			LinkControl linkControl = new LinkControlManager();
			linkControl.Click();

		}
	}
}
