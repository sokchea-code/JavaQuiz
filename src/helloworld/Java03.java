package helloworld;

import java.util.Scanner;

public class Java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Enter username: ");
        username = sc.nextLine();

        if (username.equals("Sokchea")) {
            System.out.println("Enter Password: ");
            password = sc.nextLine();
            if (password.equals("2111")) {
                System.out.println("You have successfully logged in!");
            }else {
                System.out.println("Incorrect password! try again");
            }
        }else {
            System.out.println("Invalid username! Try again");
        }
    }
}
