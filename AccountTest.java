public class AccountTest{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(100.00, 2000.00);
        BankAccount account2 = new BankAccount(50.00, 500.00);
        BankAccount account3 = new BankAccount(999999.00, 999999.00);

        account1.depositChecking(100);
        account1.withdrawChecking(500);

        System.out.println(account1.getChecking());
        System.out.println(account3.getSavings());
    }

}