/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurantbill;

import java.text.DecimalFormat;

/**
 *
 * @author thhoo7460
 */
public class RestaurantBill {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //This program displays the cost, tax, and total for a meal
        DecimalFormat x = new DecimalFormat("###.##");
        double mealCost = 107.84;
        double tax = 14.0192;
        double totalCost = mealCost + tax;
        System.out.println("          McDonalds Bill");
        System.out.println("**********************************");
        System.out.println("Meal:               $" + x.format(mealCost));
        System.out.println("HST(13%):           $" + x.format(tax));
        System.out.println("Total:              $" + x.format(totalCost));
    }
    
}
