/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compressedstringq;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class CompressedStringQ {

    public static String compressedString(String typedString) {

        StringBuilder exit = new StringBuilder();
        
        char char1 = typedString.charAt(0);
        int length = 1;
        for (int index = 1; index < typedString.length(); index++) {
            char char2 = typedString.charAt(index);
            if (char1 == char2) {
                length = length + 1;
            } else {
                exit.append(char1);
                exit.append(length);
                char1 = char2;
                length = 1;
            }
        }
        exit.append(char1);
        exit.append(length);
        
        return exit.toString().length() <= typedString.length() ? exit.toString() : typedString;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typedString;
        System.out.println("Type the string:");
        typedString = scan.next();
        System.out.println(compressedString(typedString));

    }

}
