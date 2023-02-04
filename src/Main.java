public class Main {
    public static void main(String[] args) {


        double totalInterest;
        double totalDue;
        double secondMonth;


        System.out.println("What is your Credit card balance? ");
            int creditCardBalance = 5000; //What the user would input
        System.out.print("What is the interest rate? ");
            double interestRate = 0.17;

        totalInterest = creditCardBalance * interestRate; //Calculation the interest for the current balance
                System.out.println("Your total interest for the first month is: " + totalInterest);


        totalDue = creditCardBalance + totalInterest;//Calculation if they user misses the first payment and has to pay more on the second month.
                System.out.println("This is how much you owe on the First month " + totalDue);
                System.out.println("You have missed your second months payment ");

        secondMonth = totalDue * totalInterest; // What the user has to pay at the second month
               System.out.println("Your total due on the second month is " + secondMonth);


    }
}