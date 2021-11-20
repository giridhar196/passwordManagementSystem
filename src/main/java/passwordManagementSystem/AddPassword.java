/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordManagementSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author girid
 */
public final class AddPassword {

    public AddPassword() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter User Name");
        String userName = in.next();
        System.out.println("Enter Password");
        String password = in.next();
        try {
            writeToFile(userName, password);
        } catch (IOException ex) {
            System.out.println("Not able to store the user name and password");
        }

    }

    public void writeToFile(String username, String password) throws IOException {
        try ( BufferedWriter out = new BufferedWriter(new FileWriter("file.txt"))) {
            out.write(username + "#" + password);
            out.newLine();
        }
    }
}
