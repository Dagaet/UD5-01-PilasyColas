package net.hiperdino.cashier;

import java.util.LinkedList;
import java.util.Queue;

import net.hiperdino.customer.Customer;

public class Cashier {

    private static Integer cashRegister = 0;
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

    public void closeCashRegister() {
        if (isOpen) {
            System.out.println("Cash Register " + cashRegister + " is closing.");
            isOpen = false;
        } else {
            System.out.println("Cash Register " + cashRegister + " is already closed.");
        }
    }

    public void addCustomer() {
        if (isOpen){
            Customer customer = new Customer();
            customersQueue.add(customer);
            customer.toString();
            System.out.println("Customer has been added.");
        } else {
            System.out.println("The cash register is not open");
        }
    }

    public void attendCustomer() {
        if (customersQueue.size() == 0){
            System.out.println("There is noone left in the queue");
        } else {
            System.out.println("\nThe next customer is being attended: \n" + customersQueue.poll());
        }
    }

    public void seeCustomers() {
        System.out.println("\nNext customers: ");        
        customersQueue.forEach((customer) -> System.out.println(customer.getName()));
        System.out.println(" ");
    }

    @Override
    public String toString() {
        String msg = "==========================\n";
        msg += "Cash Register number: " + cashRegister;
        msg += "\nNumber of clients: " + customersQueue.size();
        msg += "\nClients in line: \n";
        for (Customer customer : customersQueue) {
            msg += customer.getName() + " ";
        }
        msg += "\n==========================";
        return msg;
    }
}
