public class BankAccount{

    private double checking;
    private double savings;
    public static int numberOfAccounts = 0;
    public static double amountOfMoney = 0.0;

    //constructor
    public BankAccount(double checkingParam, double savingsParam){
        checking = checkingParam;
        savings = savingsParam;
        numberOfAccounts++;
    }

    //getters
    public double getChecking(){
        return this.checking;
    }
    public double getSavings(){
        return this.savings;
    }

    //setters
    public void depositChecking(double checking){
        this.checking += checking;
        amountOfMoney += checking;
    }
    public void depositSavings(double savings){
        this.savings += savings;
        amountOfMoney += savings;
    }

    public void withdrawChecking(double checking){
        if(this.checking >= checking){
            this.checking -= checking;
            amountOfMoney -= checking;
        }
        else{
            System.out.println("Insufficient funds.");
        }
        
    }
    public void withdrawSavings(double savings){
        if(this.savings >= savings){
            this.savings -= savings;
            amountOfMoney -= savings;
        }
        else{
            System.out.println("Insufficient funds.");
        }   
    }

    public double getTotalBalance(){
        double total = 0.0;
        total = checking + savings;
        return total;
    }

}