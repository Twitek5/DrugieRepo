import java.io.IOException;

public class KIK {
	
	 public static void main(String[] args)  {
		 
		 KIKInterfejs kolkoIKrzyzykInterfejs = new KIKInterfejs();
		 Plansza plansza = new Plansza();		 
		 int menu = kolkoIKrzyzykInterfejs.menu();
		 
		 String gracz1 = kolkoIKrzyzykInterfejs.podajImie();
		 String gracz2 = kolkoIKrzyzykInterfejs.podajImie();
		 
		 int pozycja = kolkoIKrzyzykInterfejs.podajPole(gracz1);
		boolean czyWstawiono = plansza.wstawZnak("X", pozycja);
		System.out.println(plansza.toString());
		
		int pozycja2 = kolkoIKrzyzykInterfejs.podajPole(gracz2);
		czyWstawiono = plansza.wstawZnak("O", pozycja);
		System.out.println(plansza.toString());
        System.out.println("test");
		
		
		
			}
	 
		
	 }


