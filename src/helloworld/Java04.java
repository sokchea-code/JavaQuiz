package helloworld;

import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int option;
        String day = " ";

        System.out.println("""
                 "==========[Menu]=========");
                        "1. Monday"
                        "2. Tuesday"
                        "3. Wednesday"
                        "4. Thursday"
                        "5. Friday"
                        "6. Saturday"
                        "7. Sunday"
                """);


        System.out.print("Please choose the option: ");
        option = sc.nextInt();

        switch (option) {
            case 1: {
                day = "Monday";
                check = true;
            }
            break;
            case 2: {
                day = "Tuesday";
                check = true;
            }
            break;
            case 3: {
                day = "Wednesday";
                check = true;
            }
            break;
            case 4: {
                day = "Thursday";
                check = true;
            }
            break;
            case 5: {
                day = "Friday";
                check = true;
            }
            break;
            case 6: {
                day = "Saturday";
                check = true;
            }
            break;
            case 7: {
                day = "Sunday";
                check = true;
            }
            break;
            default: {
                System.out.println("Please choose a valid option from 1-7!");
            }
        }
        if (check) {
            System.out.println("Today is: " + day);

        }
    }

    public static class Java01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int id;
            String name;
            String gender;
            int age;
            String address;
            String School;
            System.out.print("Enter Name: ");
            name = sc.next();
            System.out.print("Enter ID: ");
            id = sc.nextInt();
            System.out.print("Enter Gender: ");
            gender = sc.next();
            System.out.print("Enter Address: ");
            address = sc.next();
            System.out.print("Enter School: ");
            School = sc.next();

            System.out.println("My name is " + name);
            System.out.println("My ID is " + id);
            System.out.println("My Gender is " + gender);
            System.out.println("My Address is " + address);
            System.out.println("My School is " + School);


        }
    }
}
