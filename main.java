public class Main{

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		Customer customer = new Customer(); // connected to the customer class
		Bank bank = new Bank(); // connected to the bank class
		Printer print = new Printer();

		

		System.out.println(" \t \t \t Welcome to CCS Banking System");
		System.out.println(" \t    In order to start, please input the following details");
		System.out.print("Please Enter Your Full Name: ");
		
		String name = input.nextLine(); // Name of customer
		bank.setName(name);

		System.out.print("Please Enter Your Address: "); // Address of customer
		String address = input.nextLine();
		bank.setAddress(address);

		System.out.print("Please Enter Your 8 digit Account Number: "); // Account number of cus must be 8
		int accNum = input.nextInt();
		// in order to have 8 digits only
		if (accNum == 8){
			bank.setAccountNum(accNum);
		} else if (accNum < 8) {
			System.out.println("Must be 8 digit!");
			System.out.println("-------------------");
			System.out.print("Please Enter Your 8 digit Account Number: ");
			accNum = input.nextInt();
		} else if (accNum > 8) {
			System.out.println("Must be 8 digit!");
			System.out.println("-------------------");
			System.out.print("Please Enter Your 8 digit Account Number: ");
			accNum = input.nextInt();
		}
		

		System.out.print("Please Enter Your Age: "); // age
		int age = input.nextInt();

		// age restriction

		if (age < 18) {
			System.out.print("!!--You must be atleast 18 years old in order perform transaction--!!");	
			System.exit(0);		
		} else{
			System.out.print("Accepted");
		}

		System.out.println("\n");

		System.out.println("Greetings to you Mr/Ms. " + name + " ---The Mininum amount in our bank is 500 php---");
		System.out.println("\n");


		// Procedure to be followed in the flow of the system
		System.out.print("[Press 1 to Balance ---- Press 2 to Deposit ---- Press 3 to Withdraw ---- Press 4 to Exit] ");
		int process = input.nextInt();

		if (process == 4){
			System.out.print("Exiting...");

		} else if (process == 1) {
				bank.takeBalance(bank.getBalance());
			

		} else if (process == 2) {
			System.out.print("Enter the amount you want to Deposit: ");
				double deposit = input.nextDouble();
				bank.setDeposit(deposit);
				bank.takeBalance(bank.getBalance());
				

		} else if (process == 3) {
			System.out.print("Enter the amout you want to Withdraw: ");
				double withdraw = input.nextDouble();
					if (withdraw > 500) {
						System.out.println("Error");
						System.out.print("Enter the amout you want to Withdraw: ");
						withdraw = input.nextDouble();
						bank.setWithdraw(withdraw);
						bank.takeBalance(bank.getBalance());
			
					} else{
						bank.setWithdraw(withdraw);
						bank.takeBalance(bank.getBalance());
			
					}
			

				
		}
		
	print.prints(bank);


	}
}
