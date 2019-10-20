public class SavingsAccount {

    public static double annualInterestRate = 0.0; //set global
    private double savingsBalance; //setting private instance variable

    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate; //change the global interest rate
    }


    public SavingsAccount(double balance){
        this.savingsBalance = balance; //set private instance to users given balance
    }

    public void calculateMonthlyInterest(){
        double newInterest;
        newInterest = this.savingsBalance * annualInterestRate / 12; //calculate interest
        this.savingsBalance += newInterest; //add new interest to current balance
        System.out.printf("$%.2f", this.savingsBalance); //print new balance
    }



}
