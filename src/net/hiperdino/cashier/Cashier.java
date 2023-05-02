package net.hiperdino.cashier;

import java.util.LinkedList;
import java.util.Queue;

import net.hiperdino.customer.Customer;

public class Cashier {

    private static Integer cashRegister = 1;
    private Queue<Customer> customersQueue = new LinkedList<>();
    private static boolean isOpen = false;

    public Cashier() {
        increase();
    };

    private static void increase() {
        cashRegister++;
    }

    public void openCashRegister() {
        if (!isOpen) {
            System.out.println("Cash Register " + cashRegister + " is open");
            isOpen = true;
        } else {
            System.out.println("Cash Register " + cashRegister + " is already open");
        }
    }

    public void addCustomer() {
        Customer customer = new Customer();
        customersQueue.add(customer);
    }

}
