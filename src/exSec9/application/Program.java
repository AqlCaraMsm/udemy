package exSec9.application;

import exSec9.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int number = s.nextInt();
        s.nextLine();
        System.out.print("Enter account holder: ");
        String holder = s.nextLine();
        char response =' ';
        while(response != 'y' && response != 'n') {
            System.out.print("Is there a initial deposit (y/n)? ");
            response = s.nextLine().charAt(0);
        }
        if(response == 'y'){
            System.out.print("Enter initial deposit: ");
            double initDeposit = s.nextDouble();
            acc = new Account(holder,number,initDeposit);
        }else{
            acc = new Account(holder,number);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(acc.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        acc.deposit(s.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(acc.toString());
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        acc.withdraw(s.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(acc.toString());

        s.close();
    }
}
