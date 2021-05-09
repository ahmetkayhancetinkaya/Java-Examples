package odev3Kodlama;

import odev3Kodlama.Management.InstructorManager;
import odev3Kodlama.Management.StudentManager;
import odev3Kodlama.Management.UserManager;
import odev3Kodlama.Persons.Instructor;
import odev3Kodlama.Persons.Student;


public class Main {

	public static void main(String[] args) {
		
		//��renci bilgileri
		Student student1 =new Student();
		student1.set_firstName("kayhan");
		student1.set_lastName("�etinkaya");
		student1.set_id(1);;
		student1.set_eMail("ahmetkayhanc@gmail.com");
		student1.set_adress("Karab�k");
		student1.set_nationalIdentity("12345678978");
		student1.set_password("1234");
		student1.set_telephone("5555555555");
		student1.setSchoolName("BSEU");
		
		//e�itmen bilgileri 
		Instructor �nstructor1 =new Instructor();
		�nstructor1.set_firstName ("Engin");
		�nstructor1.set_lastName("Demiro�");
		�nstructor1.set_id(2);;
		�nstructor1.set_eMail("engindemirog@xxxxx.xxx");
		�nstructor1.set_adress("Sakarya");
		�nstructor1.set_nationalIdentity("98765432112");
		�nstructor1.set_password("5264");
		�nstructor1.set_telephone("666666666");
		�nstructor1.setSalary(5000);
		
		

		StudentManager studentManager = new StudentManager();
		InstructorManager �nstructorManager = new InstructorManager();
		
		studentManager.add(student1); 
		�nstructorManager.add(�nstructor1);
		
		

	
	}

}
