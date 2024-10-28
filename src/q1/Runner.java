package q1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter your marital status: ");
        Scanner input = new Scanner(System.in);
       String status = input.next();
        System.out.println("Enter your income: ");
        double income = input.nextDouble();
        TaxCalculation taxCalculation = new TaxCalculation(income,status);
        System.out.println("Your tax is : "+taxCalculation.calculateTax());

    }
}
