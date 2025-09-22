/*BENJAMIN WAMBUA MAUNDU

ADMISION NUMBER: S10-5086-2023

SCHOOL OF PURE AND APPLIED SCIENCES

BSC MATHEMATICS
*/


import java.util.Scanner;

public class discountLevels {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //user to enter the price

       System.out.print("Enter the price of the item: ");

        double price = input.nextDouble();

        double discountRate;

        //given discounts

        if (price < 500) {
            discountRate = 0;
        }
        else if (price < 1000) {
            discountRate = 0.02;
        }
         else if (price < 2000) {
            discountRate = 0.05;
        }
          else if (price < 5000) {
            discountRate = 0.10;
        }
        else {
            discountRate = 0.20;
        }

        double Discount = price * discountRate;
        double finalPrice = price - Discount;


        System.out.println("\n--- Discount calculation ---");
        System.out.println("Original price: " + price);

        System.out.println("Discount rate: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: " + Discount);
        System.out.println("FInal price: " + finalPrice);

        input.close();



    }
    
}
