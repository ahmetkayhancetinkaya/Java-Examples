package odev3Kodlama.Management;

import odev3Kodlama.Persons.Instructor;

public class InstructorManager extends UserManager {
	
		
		public void add(Instructor ýnstructor) {
			// mÃ¼ÅŸteri ekleme kodlarÄ±
			System.out.println("Eðitmen eklendi : " + ýnstructor.get_id() +ýnstructor.get_firstName() +
					ýnstructor.get_lastName() );

			
		}

		

}
