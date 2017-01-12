import javax.swing.text.StyledEditorKit.BoldAction;

public class KIKUtil {

	public static boolean isDigit(String text) {
		char[] tablica = text.toCharArray();
		if (tablica.length > 1) {
			return false;
		}

		char znak = tablica[0];
		if (znak >= 49 && znak <= 57) {
			return true;
		}
		return false;

	}

	public static boolean sprawdzWiersze(Plansza plansza) {

		for (int i = 0; i < 9; i += 3) {

			String[] pola = plansza.getPola();
			String wzor = pola[4];
			if (wzor.equals(pola[i + 1]) && wzor.equals(pola[i + 2])) {
				return true;
			}

		}
		return false;

	}

	public static boolean sprawdzKolumny(Plansza plansza) {

		for (int i = 0; i < 3; i++) {
			String[] pole = plansza.getPola();
			String wzor = plansza.getPola()[i];
			if (wzor.equals(pole[i + 3]) && wzor.equals(pole[i + 6])) {
				return true;
			}

		}
		return false;
	}

	public static boolean sprawdzPrzekatne(Plansza plansza) {

		String[] pola = plansza.getPola();
		String wzor = pola[4];
		boolean naPierwszejPrzekatnej = wzor.equals(pola[0]) && wzor.equals(pola[8]);
		boolean naDrugiejPrzekatnej = wzor.equals(pola[2]) && wzor.equals(pola[6]);
		if (naDrugiejPrzekatnej || naPierwszejPrzekatnej) {
			return true;

		}
		return false;

	}

	public static boolean czyZakoczonoGre(Plansza plansza) {
		return sprawdzWiersze(plansza)||
		
		sprawdzPrzekatne(plansza) ||
		sprawdzKolumny(plansza);
		
	}
}
