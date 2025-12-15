package com.deltaorganisation;

import java.util.Scanner;

public class ChoiceLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scCont = new Scanner(System.in);
        EmployeeHandler handler = new EmployeeHandler();
        int choicetoContinueOrNot;

        while (true) {
            System.out.println("Enter a number to Continue OR 100 to exit");
            choicetoContinueOrNot = scCont.nextInt();
            if (choicetoContinueOrNot == 100) {
                break;
            }

            int choice;
            do {
                System.out.println("\nPlease Make a Choice : ");
                System.out.println("1> List of All Current Employees");
                System.out.println("2> List of All Retired Employees");
                System.out.println("3> List of All Departments with Names");
                System.out.println("4> Edit Existing Employee Or Dept");
                System.out.println("5> Terminate Employee or Delete Department");
                System.out.println("6> Display the top 3 highest paid Employees with their Salaries");
                System.out.println("7> Employees Joined in the last 2 Years");
                System.out.println("8> Search For the Employees with same name");
                System.out.println("9> List How many Employees work in Each Department");
                System.out.println("10> Salary of the Department Head in a given Department");
                System.out.println("11> Official Location of the Employee");
                System.out.println("12> Display Qualification Details of a given Employee");
                System.out.println("13> Refresh Digital Signature");
                System.out.println("14> Quit");
                System.out.println("\nEnter Your Choice");

                choice = sc.nextInt();
                if (choice < 1 || choice > 14) {
                    System.out.println("Invalid Choice. Please choose between 1-14.");
                }
            } while (choice < 1 || choice > 14);

            switch (choice) {
                case 1:
                    // Implement to list Current Employees
                    break;
                case 2:
                    // Implement to list Retired Employees
                    break;
                case 3:
                    // Implement to list Departments
                    break;
                case 4:
                    // Implement editing function
                    break;
                case 5:
                    // Implement termination function
                    break;
                case 6:
                    // Implement function to display top 3 highest paid employees
                    break;
                case 7:
                    // Implement function to list employees joined in last 2 years
                    break;
                case 8:
                    // Implement search function
                    break;
                case 9:
                    // Implement function to list employees per dept
                    break;
                case 10:
                    // Implement function to list dept head salary
                    break;
                case 11:
                    // Implement function to show employee's official location
                    break;
                case 12:
                    // Implement function to display employee qualification details
                    break;
                case 13:
                    // Implement function to refresh digital signature
                    break;
                case 14:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid Choice. Please choose between 1-14.");
            }
        }
        sc.close();
        scCont.close();
    }
}
