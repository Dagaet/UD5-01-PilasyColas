package net.hiperdino;

import java.util.Scanner;

import net.hiperdino.cashier.Cashier;

public class App {
    public static void main(String[] args) throws Exception {
        final Cashier cashier = new Cashier();
        final Scanner keyboard = new Scanner(System.in);
        int option = -1;

        while (option !=5) {
            System.out.println("=======================");
            System.out.println("Welcome to Hiperdino!!!");
            System.out.println("What do you want to do?");
            System.out.println("1. Open the cash register.");
            System.out.println("2. Add a ney customer.");
            System.out.println("3. Attend a customer.");
            System.out.println("4. See all customers.");
            System.out.println("5. Exit the program.");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    cashier.openCashRegister();
                    break;
                case 2:
                    cashier.addCustomer();
                    System.out.println("Customer has been added.");
                    break;
                case 3:
                    cashier.attendCustomer();
                    break;
                case 4:
                    cashier.seeCustomers();
                    break;
                case 5:
                    cashier.closeCashRegister();    
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Select one.");
                    break;
            }
        }
    keyboard.close();
    }
}
