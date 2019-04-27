import java.util.Scanner;

class Account
{

	int bal;
	int prevTransaction;
	String name;
	String id;
	
	Account(String cname, String cid) // Constructor: same name as class and no return type.
	{
		name = cname;
		id = cid;
	}
	
	
	
	void deposit(int amount)
	{
		if(amount !=0)
		{
			bal=bal+amount;
			prevTransaction = amount;
		}
	}
	
	
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			bal = bal - amount;
			prevTransaction = -amount; // we are withdrawing amount
		}
	}
	
	
	
	
	void getprevTransaction() // Tells about deposited or withdraw amount
	{
		if(prevTransaction > 0)
		{
			System.out.println("Deposited: " + prevTransaction);
		}
		
		else if(prevTransaction < 0)
		{
			System.out.println("Withdraw: " +Math.abs(prevTransaction)); // Math.abs: Take any value and give the positive of it.
		}
		
		else
		{
			System.out.println("No transaction recorded");
		}
	}
	
	
	
	void Menu()
	{
		char option='\0';
		Scanner scanner = new Scanner(System.in);
				
				System.out.println("Welcome to " + name);
				System.out.println("Your user ID is " + id);
				
				System.out.println("\n");
				
				System.out.println("A. Check Balance");
				System.out.println("B. Deposit");
				System.out.println("C. Withdraw");
				System.out.println("D. Previous transaction");
				System.out.println("E. Exit");
				
				do
				{
					System.out.println("=================================================");
					System.out.print("Enter an option : ");
					option = scanner.next().charAt(0);
					System.out.println("=================================================");
					
					
					switch(option)
					{
					
					case 'A':
						System.out.println("-----------------------------------------------");
						System.out.println("Current Balance = "+bal);
						System.out.println("-----------------------------------------------");
						System.out.println("\n");
						break;
						
					case 'B':
						System.out.println("-----------------------------------------------");
						System.out.println("Enter amount to be deposited in your account");
						System.out.println("-----------------------------------------------");
						try{
						int amount = scanner.nextInt();
						deposit(amount);
						System.out.println("\n");
						}
						catch(Exception e){
							System.out.println("wrong input");
							System.out.println("Back to main menu");
						}
						break;
						
						
					case 'C':
						System.out.println("-----------------------------------------------");
						System.out.println("Enter amount to be withdrawn from your account");
						System.out.println("-----------------------------------------------");
						try{
						int amount2 = scanner.nextInt();
						withdraw(amount2);
						System.out.println("\n");
						}
						catch(Exception e){
							System.out.println("wrong input");
							System.out.println("Back to main menu");
						}
						
						break;
						
					
					case 'D':
						System.out.println("-----------------------------------------------");
						getprevTransaction();
						System.out.println("-----------------------------------------------");
						System.out.println("\n");
						break;
						
						
					case 'E':
						System.out.println("****************************************");
						break;
						
					
					default:
						System.out.println("default");
						
					}
				}while(option !='E');
				
				System.out.println("Thanku");
				
			}
				
				
	}
	
	
	
	
	