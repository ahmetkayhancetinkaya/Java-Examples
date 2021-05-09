package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _eMail;
	private String _password;
	private boolean _activateOfStatus;
	
	public User( ) {
		
	}
	
	
	public User(int _id, String _firstName, String _lastName, String _eMail, String _password,
			boolean _activateOfStatus) {
		super();
		this._id = _id;
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._eMail = _eMail;
		this._password = _password;
		this._activateOfStatus = _activateOfStatus;
	}


	public int getId() {
		return _id;
	}


	public void setId(int id) {
		_id = id;
	}


	public String getFirstName() {
		return _firstName;
	}


	public void setFirstName(String firstName) {
		_firstName = firstName;
	}


	public String getLastName() {
		return _lastName;
	}


	public void setLastName(String lastName) {
		_lastName = lastName;
	}


	public String getEMail() {
		return _eMail;
	}


	public void setEMail(String eMail) {
		_eMail = eMail;
	}


	public String getPpassword() {
		return _password;
	}


	public void setPassword(String password) {
		_password = password;
	}


	public boolean isActivateOfStatus() {
		return _activateOfStatus;
	}


	public void setActivateOfStatus(boolean activateOfStatus) {
		_activateOfStatus = activateOfStatus;
	}

}
