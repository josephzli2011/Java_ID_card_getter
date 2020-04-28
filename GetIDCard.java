import java.util.*;
public class GetInfoAndPrintId {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("What's your name? ");
		String name=s.nextLine();
		System.out.println();
		System.out.print("Your ID number? ");
		int IDnumber = s.nextInt();
		System.out.println();
		System.out.print("Your weight? ");
		double weight = s.nextDouble();
		System.out.println();
		System.out.print("Your height (In inches, an integer)? ");
		int height = s.nextInt();
		System.out.println();
		System.out.print("What business do you work for (If 2 or more words, type it with a underscore character For example: Ernest_and_Young)? ");
		int business = s.next();
		System.out.println();
		System.out.print("What is your job title (For example: Software engineer, CEO, Co-founder)");
		String title = s.nextLine();
		System.out.println();
		System.out.println("Here's your ID card: ");
		System.out.println();
		System.out.println(name+"              #"+IDnumber);
		System.out.println(title+" at "+business);
		System.out.println("Weight: "+weight);
		System.out.println("Height: "+height);
		
		
	}
}