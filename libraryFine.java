/*BENJAMIN WAMBUA MAUNDU

ADMISION NUMBER: S10-5086-2023

SCHOOL OF PURE AND APPLIED SCIENCES

BSC MATHEMATICS
*/

import java.util.Scanner;

public class libraryFine {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //input from student
        System.out.print("Enter book ID: ");
        String bookID = input.nextLine();

        System.out.print("Enter Due Date: ");
        int dueDate = input.nextInt();

        System.out.print("Enter Return Date: ");
        int returnDate = input.nextInt();


        //overduedate calculation
        int daysOverdue = returnDate - dueDate;

        //fine rate 
        int fineRate;
        if (daysOverdue <= 0) {
            fineRate = 0;
            daysOverdue = 0;
        }
        else if (daysOverdue <= 7) {
            fineRate = 20;
        }
        else if (daysOverdue <= 14) {
            fineRate = 50;
        }
        else {
            fineRate = 100;
        }

        //fin amount calculation
        int fineAmount = daysOverdue * fineRate;

        //display results
        System.out.println("\n--- Library Fine Details ---");
        System.out.println("Book ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date " + returnDate);
        System.out.println("Days overdue: " + daysOverdue);
        System.out.println("Fine Rate (daily):ksh. " + fineRate);
        System.out.println("Total Fine: ksh. " + fineAmount);

        input.close();
    
    }
}




