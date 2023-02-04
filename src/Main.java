public class Main {
    public static void main(String[] args) {

        System.out.println("What is your Credit card balance? ");
        int creditCardBalance = 5000;
        System.out.print("What is the interest rate? ");
        double interestRate = .17;
        double totalInterest;
        double totalDue;
        double secondMonth;
        totalInterest = creditCardBalance * interestRate;
        totalDue = creditCardBalance + totalInterest;
        System.out.print("This is how much you owe on the First month "+ totalDue);
        secondMonth = totalDue * totalInterest;
        System.out.print("Your total due on the second month is " + secondMonth);


    }
}