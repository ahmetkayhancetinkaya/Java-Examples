package intro;

public class Main {
	public static void main(String[] args) {

		// camelCase
		// Don't repeat yourself
		String internetSubeButonu = "�nternet �ubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.30;
		int vade = 36;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t� resmi");
		} else if (dolarDun == dolarBugun) {
			System.out.println("Dolar e�it resmi");
		} else {
			System.out.println("Dolar y�kseldi resmi");
		}

		String kredi1 = "H�zl� kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "�ift�i kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);

		String krediler[] = { "H�zl� Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "�ift�i Kredisi", "Msb Kredisi",
				"Meb Kredisi" };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
