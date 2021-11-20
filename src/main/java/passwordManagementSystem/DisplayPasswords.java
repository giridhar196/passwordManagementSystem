/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordManagementSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author girid
 */
public class DisplayPasswords {

    public void displayPasswords() {
        File inputFile = new File("File.txt");
        String userNameInput = "";
        String passwordInput = "";
        try {
            try ( Scanner in = new Scanner(new File("File.txt"))) {
                while (in.hasNextLine()) {
                    String s = in.nextLine();
                    String[] sArray = s.split(",");
                    System.out.println("------------------------------");
                    System.out.println("User Name: " + sArray[0]); //Just to verify that file is being read
                    System.out.println("Password: " + sArray[1]);
                    System.out.println("------------------------------");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("User Database Not Found Error");
        }
    }
}
