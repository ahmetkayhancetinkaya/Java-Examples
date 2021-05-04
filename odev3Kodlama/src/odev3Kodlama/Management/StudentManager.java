package odev3Kodlama.Management;

import odev3Kodlama.Persons.Student;

public class StudentManager extends UserManager {

	public void add(Student student) {

		System.out.println("Öğrenci eklendi : " + student.get_id() + student.get_firstName() + 
				student.get_lastName());

	}

}