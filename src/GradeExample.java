class BankAccount {
    int balance = 0;     // 예금 잔액

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
    
    public static void main(String[] args) {
    	BankAccount ref1 = new BankAccount();
    	BankAccount ref2= ref1;
    	
    	ref.deposit(3000);
    	ref.deposit(2000);
    	ref1.withdraw(400);
    	ref1.withdraw(300);
    	ref1.checkMyBalanc);
    	ref1.checkMyBalance();