package linkcontrol;

import java.util.Scanner;

public class LinkControlManager implements LinkControl {
	
	public LinkControlManager() {
		
	}

	@Override
	public void Click() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("--------------------\nLinke t�klad�ysan�z 1'i t�klmad�ysan�z 0'� tu�lay�n : ");
		int button = scanner.nextInt();
		System.out.print("--------------------\n");

		if (button == 1) {
			System.out.print("Hesab�n�z ba�ar�l� bir �ekilde aktive edilmi�tir. ");
		} else {
			System.out.print("Hesab�n�z� aktive edemedik.. ");
		}

	}

}
