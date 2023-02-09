import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Input Book Name : ");
		String book = sc.nextLine();
		System.out.print("Input Year : ");
		int year = sc.nextInt();
		System.out.print("Input Author Name : ");
		String name = sc.nextLine();
		System.out.print("Input E-Mail : ");
		String email = sc.nextLine();
		System.out.println();
		
		FictionBook book = new Fictionbook();
		System.out.println(book.toString());

	}

}
