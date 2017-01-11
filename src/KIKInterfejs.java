import java.util.Scanner;

public class KIKInterfejs {

	public int menu() {

		System.out.println("1. Start");
		System.out.println("0. Wyniki");
		Scanner scanner = new Scanner(System.in);
		int odp = scanner.nextInt();
		return odp;
	}

	public String podajImie() {
		System.out.println("podaj swoje imie");
		Scanner scanner = new Scanner(System.in);
		String imie = scanner.nextLine();
		return imie;

	}

	public int podajPole(String imie) {

		System.out.println("Gracz: " + imie);
		System.out.println("Podaj nr pola: ");
		Scanner scanner = new Scanner(System.in);
		int pozycja = scanner.nextInt();
		return pozycja;

	}

	public void pokazPlansze(Plansza plansza) {
		System.out.println(plansza.toString());
	}

	public void podanoNiepoprawnePole() {
		System.out.println("Podano niepoprawne pole. Sprobuj jeszcze raz");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

}
