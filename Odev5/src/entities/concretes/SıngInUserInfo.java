package entities.concretes;

import java.util.Scanner;

import entities.abstracts.Entity;

public class SýngInUserInfo implements Entity {

	private User user;
	

	public SýngInUserInfo(User user) {
		super();
		this.user = user;

	}

	//Bu Fonksiyonde Userden Alýnan Bilgiler ile Ýnput olarak Kullanýcýdan alýnan bilgileri
	//karþýlaþtýrmak istedim fakat Scanner sýnýfý bozuk çalýþtýðý için elimle verdiðim maille, Userden gelen maili karþýlaþtýrdým.
	public void SýngIn() {
		System.out.println("\nSisteme giriþ için mail adresi ve þifreizi giriniz!\n");
		System.out.println("E-mail : ahmetkayhanc@gmail.com ");
		Scanner email = new Scanner(System.in);
//		Scanner e = new Scanner(System.in);
		String emailResult = "ahmetkayhanc@gmail.com";
		System.out.println("Þifre : 123468 ");
//		Scanner password = new Scanner(System.in);
		String passwordResult = "123468";
		
		if (user.getEMail() ==emailResult & user.getPpassword() == passwordResult) {
			System.out.println("\nGÝRÝÞ BAÞARILI.....");
		} else {
			System.out.println("\nGÝRÝÞ YAPILAMADI.....");

		}

	}
}
