import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        double depositAmount = 0.00; // broj u  intervalu od 100.00 do 10000.00
        int termOfTheDeposit = 0; // vrijednost od 1-12
        double annualInterestRate = 0.00; // u intervalu od 0.00 do 100.00

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter deposit amount in the interval 100.00 - 10000.00");
        double unos1 = scan.nextDouble();
        if (unos1 > 100.00 && unos1 < 10000.00) {
            depositAmount = unos1;
        } else {
            System.out.println("You have entered a number out of the allowed range");
        }

        // calculating the accrued interest
        System.out.println("Enter the annual interest rate in the interval 00.00 - 100.00");
        double unos2 = scan.nextDouble();
        if (unos2 > 00.00 && unos2 < 100.00) {
            annualInterestRate = unos2;
        } else {
            System.out.println("You have entered a number out of the allowed range");
        }

        // calculate from annualInterestRate input and deposit amount input
        double annualInterest = (depositAmount * annualInterestRate) / 100; // because we input the percentage
        System.out.println("Calculated interest (annualInterestRate * depositAmount) = " + annualInterest);

        // interest for one month based on the input deposit ( annualInterest / 12 )
        double monthlyInterest = (annualInterest / 12); // we already divided the input percentage of annualInterest by 100 so we don't do it again for the monthly interest because it is no longer a percentage. If we didnt turn the percentage above into a float, we would need to divide it to get a float or double
        System.out.println("Interest for one month = " + monthlyInterest); // no / 100 because above we use the input annualinterest of 5.7 % which is 0.057 so we need to do 5.7 / 100 and also monthly / 100

        //get term of the deposit

        System.out.println("Enter term of deposit in months:");
        termOfTheDeposit = scan.nextInt();

        // Calculating how much will we receive at the end of the deposit period at the certain input interest rate
        // formula: amount = deposited amount + term of the deposit(in months) * ((deposited amount * anual interest rate)/12))

        double totalAmount = depositAmount + termOfTheDeposit * ((monthlyInterest));
        System.out.println("The total amount is: " + totalAmount);





    }
}
