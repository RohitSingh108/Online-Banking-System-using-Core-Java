import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String username;
		String userid;
		
		
		System.out.println("             WELCOME TO ONLINE BANKING SYSTEM    ");
		System.out.println("Please enter your name");
		username = s.nextLine();
		
		System.out.println("Please enter your user ID");
		userid = s.nextLine();	
		
		Account obj = new Account(username,userid); // Whenever object is created, the constructor will be invoked.
		obj.Menu();

	}

}
