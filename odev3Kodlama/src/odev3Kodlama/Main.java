package odev3Kodlama;

import odev3Kodlama.Management.InstructorManager;
import odev3Kodlama.Management.StudentManager;
import odev3Kodlama.Management.UserManager;
import odev3Kodlama.Persons.Instructor;
import odev3Kodlama.Persons.Student;


public class Main {

	public static void main(String[] args) {
		
		//Öðrenci bilgileri
		Student student1 =new Student();
		student1.set_firstName("kayhan");
		student1.set_lastName("Çetinkaya");
		student1.set_id(1);;
		student1.set_eMail("ahmetkayhanc@gmail.com");
		student1.set_adress("Karabük");
		student1.set_nationalIdentity("12345678978");
		student1.set_password("1234");
		student1.set_telephone("5555555555");
		student1.setSchoolName("BSEU");
		
		//eðitmen bilgileri 
		Instructor ýnstructor1 =new Instructor();
		ýnstructor1.set_firstName ("Engin");
		ýnstructor1.set_lastName("Demiroð");
		ýnstructor1.set_id(2);;
		ýnstructor1.set_eMail("engindemirog@xxxxx.xxx");
		ýnstructor1.set_adress("Sakarya");
		ýnstructor1.set_nationalIdentity("98765432112");
		ýnstructor1.set_password("5264");
		ýnstructor1.set_telephone("666666666");
		ýnstructor1.setSalary(5000);
		
		

		StudentManager studentManager = new StudentManager();
		InstructorManager ýnstructorManager = new InstructorManager();
		
		studentManager.add(student1); 
		ýnstructorManager.add(ýnstructor1);
		
		

	
	}

}
