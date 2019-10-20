public class Application {
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.0); //open saver1
        SavingsAccount saver2 = new SavingsAccount(3000.0); //open saver2
        SavingsAccount.modifyInterestRate(0.04); //set interest rate to 4%

        System.out.println("Saver 1");
        System.out.println("--------");
        for(int i=1; i<=12; ++i){ //for each month, calculate new balance
            System.out.print("Month " + i + ": ");
            saver1.calculateMonthlyInterest();
            System.out.println();
        }

        System.out.println("--------");
        System.out.println("Saver 2");
        System.out.println("--------");
        for(int i=1; i<=12; ++i){
            System.out.print("Month " + i + ": ");
            saver2.calculateMonthlyInterest();
            System.out.println();
        }

        System.out.println("--------");

        System.out.println("Changing interest rate to 5%");
        SavingsAccount.modifyInterestRate(0.05); //change interest rate to 5%

        System.out.println("Saver 1");
        System.out.println("--------");
        for(int i=1; i<=12; ++i){
            System.out.print("Month " + i + ": ");
            saver1.calculateMonthlyInterest();
            System.out.println();
        }

        System.out.println("--------");
        System.out.println("Saver 2");
        System.out.println("--------");
        for(int i=1; i<=12; ++i) {
            System.out.print("Month " + i + ": ");
            saver2.calculateMonthlyInterest();
            System.out.println();
        }
    }
}
