import java.util.Scanner;

public class PetlaDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum=0;
		double sr=0;
		double i=0;
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		do 
		{
			System.out.println("Podaj liczb�: ");
			number = scanner.nextInt();
			sum = sum + number;
			System.out.println("Suma wynosi: "+sum);
			i++;
			if 
			((number < min) && (number !=0))
			{
				min = number ;
			}
			
			
			
			if ((number > max) && (number !=0))
			{	
			max = number;	
			}
			sr= sum/i;
			System.out.println("�rednia wynosi: "+sr);
		} while (number !=0);
		System.out.println("Suma wynosi: "+sum);
		System.out.println("�rednia wynosi: "+sr);
	System.out.println ("Warto�� najwi�ksza to: "+max);
	System.out.println("Warto�� najmniejsza to: "+min);	
	
	scanner.close();
	}

}
