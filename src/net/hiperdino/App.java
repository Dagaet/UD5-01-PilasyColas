package net.hiperdino;

import net.hiperdino.cashier.Cashier;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(customer.toString());

        Cashier cashier = new Cashier();
        cashier.openCashRegister();
        cashier.openCashRegister();

        cashier.addCustomer();
        cashier.addCustomer();
        cashier.addCustomer();

        cashier.attendCustomer();
        cashier.seeCustomers();
    }
}
