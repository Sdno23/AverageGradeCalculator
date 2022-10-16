/*
 * @author 3156908
 *
 * @version 1.0 05/25/2020
 *
 * Title: Averaging Quiz Grades
 *
 * Semester: Summer 2020
 *
 * Lecturer's Name: C. Charters
 */
package main;
import java.util.Scanner;

/**
 *
 * @author 3156908
 */

public class Calculator {

    /**
     * @param args no arguments used in this method.
     */

    public static void main(String[] args) {
        
    calcGrades();
    
    }
    
    public static void calcGrades() {
            
        Scanner scnr = new Scanner (System.in);

        double quizOne;
        double quizTwo;
        double quizThree;
        double quizFour;
        double quizFive;
        double quizTotals;
        double quizAverage;
        
        System.out.print("Enter quiz grade #1: "); //User is asked to type in first quiz grade.//
        quizOne = scnr.nextDouble();
        
        System.out.print("Enter quiz grade #2: "); //User is asked to type in second quiz grade.//
        quizTwo = scnr.nextDouble();
        
        System.out.print("Enter quiz grade #3: "); //User is asked to type in third quiz grade.//
        quizThree = scnr.nextDouble();
        
        System.out.print("Enter quiz grade #4: "); //User is asked to type in fourth quiz grade.//
        quizFour = scnr.nextDouble();
        
        System.out.print("Enter quiz grade #5: "); //User is asked to type in fifth quiz grade.//
        quizFive = scnr.nextDouble();
        
        quizTotals = (quizOne + quizTwo + quizThree + quizFour + quizFive); //Grades are added together.//
        
        quizAverage = quizTotals / 5; //Sum of quiz grades is divided by 5 to get total average.//
        
        System.out.print("The following quiz grades were entered: "); //All typed grades are outputted to the user.//
        System.out.printf("%.1f %.1f %.1f %.1f %.1f\n", quizOne, quizTwo, quizThree, quizFour, quizFive); //Grades output is formatted to show 1 decimal place value only.//
        System.out.print("The average of all quiz grades is: "); //Average total is outputted to the user.//
        System.out.printf("%.1f", quizAverage); //Average output is formatted to show 1 decimal place value only.//
        System.out.println(" ");
    }
        
    
}
