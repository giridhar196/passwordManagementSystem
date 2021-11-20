/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordManagementSystem;

import java.util.Scanner;

/**
 *
 * @author girid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Display the menu
        System.out.println("1\t Add New Password");
        System.out.println("2\t Edit Password");
        System.out.println("3\t Display");
        System.out.println("4\t Delete All Passwords");
        System.out.println("5\t Exit");

        System.out.println("Please enter your choice:");

        //Get user's choice
        int choice = in.nextInt();

        //Display the title of the chosen module
        switch (choice) {
            case 1:
                System.out.println("Adding New Password");
                AddPassword adp = new AddPassword();
                break;
            case 2:
                System.out.println("Edit Password");
                break;
            case 3:
                System.out.println("\n\nDisplay Password");
                DisplayPasswords dp = new DisplayPasswords();
                dp.displayPasswords();
                break;
            case 4:
                System.out.println("Delete All Information");
                break;
            case 5:
                System.out.println("Exit");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }//end of switch
    }

}
