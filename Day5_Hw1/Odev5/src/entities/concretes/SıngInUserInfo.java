package entities.concretes;

import java.util.Scanner;

import entities.abstracts.Entity;

public class S�ngInUserInfo implements Entity {

	private User user;
	

	public S�ngInUserInfo(User user) {
		super();
		this.user = user;

	}

	//Bu Fonksiyonde Userden Al�nan Bilgiler ile �nput olarak Kullan�c�dan al�nan bilgileri
	//kar��la�t�rmak istedim fakat Scanner s�n�f� bozuk �al��t��� i�in elimle verdi�im maille, Userden gelen maili kar��la�t�rd�m.
	public void S�ngIn() {
		System.out.println("\nSisteme giri� i�in mail adresi ve �ifreizi giriniz!\n");
		System.out.println("E-mail : ahmetkayhanc@gmail.com ");
		Scanner email = new Scanner(System.in);
//		Scanner e = new Scanner(System.in);
		String emailResult = "ahmetkayhanc@gmail.com";
		System.out.println("�ifre : 123468 ");
//		Scanner password = new Scanner(System.in);
		String passwordResult = "123468";
		
		if (user.getEMail() ==emailResult & user.getPpassword() == passwordResult) {
			System.out.println("\nG�R�� BA�ARILI.....");
		} else {
			System.out.println("\nG�R�� YAPILAMADI.....");

		}

	}
}
