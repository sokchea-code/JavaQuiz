package helloworld;

//import javax.swing.*;
//
//public class homework2 {
//    public static void main(String[] args) {
//        float score1 ;
//        float score2 ;
//        float score3 ;
//        float score4 ;
//        float score5 ;
//        score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 1: "));
//        score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 2: "));
//        score3 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 3: "));
//        score4 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 4: "));
//        score5 = Integer.parseInt(JOptionPane.showInputDialog("Enter score 5: "));
//        float totalScore = score1 + score2 + score3 + score4 + score5 ;
//        float averageScore = totalScore / 5;
//        System.out.println("Total score: " + totalScore);
//        JOptionPane.showMessageDialog(null, "Total score: " + totalScore + "\nAverage score: " + averageScore);
//    }
//}

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score1: ");
        int score1 = sc.nextInt();
        System.out.print("Enter your score2: ");
        int score2 = sc.nextInt();
        System.out.print("Enter your score3: ");
        int score3 = sc.nextInt();
        System.out.print("Enter your score4: ");
        int score4 = sc.nextInt();
        System.out.print("Enter your score5: ");
        int score5 = sc.nextInt();


        float average = (score1 + score2 + score3 + score4 + score5) / 5;
        if (average >= 90 && average <= 100) {
            System.out.println("Grade A");
        }else if (average  >= 80) {
            System.out.println("Grade B");
        }else if (average  >= 70) {
            System.out.println("Grade C");
        }else if (average  >= 60) {
            System.out.println("Grade D");
        }else if (average  >= 50) {
            System.out.println("Grade E");
        }else {
            System.out.println("Grade F");
        }
        System.out.println("Average score: " + average);
        int totalScore = score1 + score2 + score3 + score4 + score5;
        System.out.println("Total Score: " + totalScore);

    }
}
