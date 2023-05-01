package net.hiperdino;

import net.hiperdino.customer.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        customer.setCustomerProducts();
        System.out.println(customer.toString());
    }
}
