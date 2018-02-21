package csc201;
/*
 * (Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme: 
 * Grade is A if score is >= best - 10; 
 * Grade is B if score is >= best - 20;
 *  Grade is C if score is >= best - 30; 
 *  Grade is D if score is >= best - 40; 
 *  Grade is F otherwise. 
 *  The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, and concludes by displaying the grades. 
 */
import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number students: ");
        int[] scores = new int[input.nextInt()];
   
        System.out.print("Enter a score for " + scores.length + " student: ");
        for(int i = 0; i < scores.length; i++)
        	scores[i] = input.nextInt();
 
        displayGrades(scores);
    }
    
    //method to display the grades
    public static void displayGrades(int[] grades) {
        int highScore = highestGrade(grades);
        
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n",
                i, grades[i], letterGrade(grades[i], highScore));
        }
    }
//method to calculate the grade for each score
    public static char letterGrade(int grade, int highScore) {

        if (highScore - grade <= 10)
            return 'A';
        else if (highScore - grade > 10 && highScore - grade <= 20)
            return 'B';
        else if (highScore - grade > 20 && highScore - grade <= 30)
            return 'C';
        else if (highScore - grade > 30 && highScore - grade <= 20)
            return 'D';
        else 
            return 'F';
    }
//Method to calculate the highest score from given grades
    public static int highestGrade(int[] grades) {
        int highScore = grades[0];

        for (int grade : grades) {
            if (grade > highScore)
                highScore = grade;
        }

        return highScore;
    }
}
