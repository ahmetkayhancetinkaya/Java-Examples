package odev3Kodlama.Management;

import odev3Kodlama.Persons.Instructor;

public class InstructorManager extends UserManager {
	
		
		public void add(Instructor �nstructor) {
			// müşteri ekleme kodları
			System.out.println("E�itmen eklendi : " + �nstructor.get_id() +�nstructor.get_firstName() +
					�nstructor.get_lastName() );

			
		}

		

}
