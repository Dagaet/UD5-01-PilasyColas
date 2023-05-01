package net.hiperdino.utils;

import java.util.Random;

public class Utils {
    
    private static final Integer[] products = new Integer[] {
        5, 7, 69, 8, 13, 72, 189, 233, 474, 522, 301, 600
    };

    public static Integer getRandomProduct() {
        Random random = new Random();
        int randomIndex = random.nextInt(Utils.products.length);
        
        return Utils.products[randomIndex];
    }

}
