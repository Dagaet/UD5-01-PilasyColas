package net.hiperdino.utils;

import java.util.Random;

public class Utils {
    
    private static final Integer[] products = new Integer[] {
        5, 7, 69, 8, 13, 72, 189, 233, 474, 522, 301, 600
    };

    private static final String[] customerNames = new String[] {
        "Amanda", "Sofía", "Flory", "Ana", "Flora", "Juan", "Pablo", "Jose Luis", "Valentin", "Ioan", 
        "Esperanza", "Rita", "Eutimio", "Plinio", "Paloma", "Josué", "Damián", "Timoteo", "Jordi", "Carlos"
    };

    public static Integer getRandomProduct() {
        Random random = new Random();
        int randomIndex = random.nextInt(Utils.products.length);
        
        return Utils.products[randomIndex];
    }

    public static String getRandomName() {
        Random random = new Random();
        int randomIndex = random.nextInt(Utils.customerNames.length);
        
        return Utils.customerNames[randomIndex];
    }
}
