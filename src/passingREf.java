
public class passingREf {

	public static void main(String[] args) {
		BankAccount ref = new BankAccount();
		ref.deposit(3000);
		ref.withdraw(300);
}
		check(ref); //참조값 전달
		
		public static void check(BankAccount acc) {
			acc.checkMyBalance();
		}
		
		
