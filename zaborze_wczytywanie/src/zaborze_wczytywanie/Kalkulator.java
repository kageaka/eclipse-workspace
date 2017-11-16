package zaborze_wczytywanie;
import java.util.Scanner;
public class Kalkulator 
{

	public static void main(String[] args)
	{

		Scanner odczyt = new Scanner (System.in);
		
		System.out.print("Podaj liczbê a:");
		int a = odczyt.nextInt();

		System.out.print("Podaj liczbê b:");
		int b = odczyt.nextInt();

		int suma = a+b;
		int mn = a*b;
		float dz = (float)a/b;
		int roznica = a-b;
		int roznica2 = b-a;
		double pierw = Math.sqrt(a);
		double pierw2 = Math.sqrt(b);
		double potega = Math.pow(a, b);
		double wba = Math.abs(a+b);

		int dzCalk = a/b;
		int reszta = a%b;
		
		System.out.println("Suma wynosi: "+suma);
		System.out.println("Iloczyn wynosi: "+mn);
		System.out.println("Iloraz wynosi: "+dz);
		System.out.println("Ró¿nica a-b wynosi: "+roznica);
		System.out.println("Ró¿nica b-a wynosi: "+roznica2);
		System.out.println("Pierwiastek a wynosi: "+pierw);
		System.out.println("Pierwiastek b wynosi: "+pierw2);
		System.out.println("a^b wynosi: "+potega);
		System.out.println("Wartoœæ bezwzglêdna z a+b wynosi: "+wba);
		
		
		System.out.println("a/b: "+dzCalk);
		System.out.println("Reszta z dzielenia a/b: "+reszta);


		
		
		
		
	}

}
