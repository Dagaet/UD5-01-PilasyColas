package net.hiperdino;

import net.hiperdino.cashier.Cashier;
import net.hiperdino.customer.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        customer.setCustomerProducts();
        // System.out.println(customer.toString());

        Cashier cashier = new Cashier();
        cashier.openCashRegister();
        cashier.openCashRegister();

        Cashier cashier2 = new Cashier();
        cashier2.openCashRegister();
        cashier2.openCashRegister();

        cashier.addCustomer();
        cashier.addCustomer();
        cashier.addCustomer();

        cashier.attendCustomer();
        cashier.seeCustomers();
    }
}
