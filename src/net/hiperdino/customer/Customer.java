package net.hiperdino.customer;

import java.util.Random;
import java.util.Stack;

import net.hiperdino.utils.Utils;

public class Customer {

    String name;
    private Stack<Integer> customerProducts = new Stack<>();

    public Customer() {
        this.name = Utils.getRandomName();
        setCustomerProducts();
    }

    public String getName() {
        return name;
    }

    public void setCustomerProducts() {
        Random random = new Random();
        int amountOfProducts = random.nextInt(30 - 1) + 1;
        for (int i = 0; i < amountOfProducts; i++) {
            customerProducts.push(Utils.getRandomProduct());
        }
    }

    @Override
    public String toString() {
        String msg = "==========================\n";
        msg += "Name: " + this.name;
        msg += "\n Products total: " + customerProducts.size();
        msg += "\n List of products: \n";
        for (int i = 0; i < customerProducts.size(); i++) {
            msg += "-> " + customerProducts.get(i);
            msg += "\n";
        }
        msg += "\n==========================";
        return msg;
    }

}
