package odev3Kodlama.Management;

import odev3Kodlama.Persons.Instructor;

public class InstructorManager extends UserManager {
	
		
		public void add(Instructor ınstructor) {
			// mÃ¼ÅŸteri ekleme kodlarÄ±
			System.out.println("Eğitmen eklendi : " + ınstructor.get_id() +ınstructor.get_firstName() +
					ınstructor.get_lastName() );

			
		}

		

}
