package linkcontrol;

import java.util.Scanner;

public class LinkControlManager implements LinkControl {
	
	public LinkControlManager() {
		
	}

	@Override
	public void Click() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("--------------------\nLinke týkladýysanýz 1'i týklmadýysanýz 0'ý tuþlayýn : ");
		int button = scanner.nextInt();
		System.out.print("--------------------\n");

		if (button == 1) {
			System.out.print("Hesabýnýz baþarýlý bir þekilde aktive edilmiþtir. ");
		} else {
			System.out.print("Hesabýnýzý aktive edemedik.. ");
		}

	}

}
