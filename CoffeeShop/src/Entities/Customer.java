package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {

	private int _id;
	private String _firstName;
	private String _lastName;
	private int _dateOfBirth;
	private long _nationalityId;

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

	public int getDateOfBirth() {
		return _dateOfBirth;
	}

	public void set_dateOfBirth(int dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public long getNationalityId() {
		return _nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		_nationalityId = nationalityId;
	}

}
