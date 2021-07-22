/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachineq;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class VendingMachineQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numProduct;
        int amount = 0;
        int multiply = 0, multiply2= 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Accepts coins of 1,5,10,25 Cents");
        System.out.println("Wich product do you want?");
        System.out.print("(1) - Coke ¢25\n(2) - Pepsi ¢35\n(3) - Soda ¢45\n");
        numProduct = scan.nextInt();

        switch (numProduct) {
            case 1:
                multiply(numProduct,amount, multiply, multiply2);
                break;
            case 2:
                multiply(numProduct,amount, multiply, multiply2);
                break;
            case 3:
                multiply(numProduct,amount, multiply, multiply2);
                break;
        }

    }

    public static void multiply(int numProduct,int amount, int multiply, int multiply2) {
       Scanner scan = new Scanner(System.in);
       String result;
        if (numProduct == 1)
        {
            
            System.out.println("Put 25 Cents");
            System.out.println("How much cents do you want to put it?");
            amount = scan.nextInt();
            treatment(amount);
            System.out.print("How many coins of " + amount + "?");
            multiply = scan.nextInt();
            multiply2 = amount * multiply;
            
            if(multiply2 < 25)
            {
                System.out.print(25 - multiply2 + " to go.");
            }
            if(multiply2 == 25 || multiply2 > 25)
            {
                System.out.print("Sure you want a Coke? [Y/N]");
                result = scan.next();
                if(result.equals("Y") || result.equals("y"))
                {
                    System.out.print("Here is your Coke. Thanks :D");
                }
                if(result.equals("N") || result.equals("n"))
                {
                    System.out.print("Ok. Here's your 25 cents. Bye :D");
                }
            }
        }
        if(numProduct == 2)
        {
            System.out.println("Put 35 Cents");
                System.out.println("How much cents do you want to put it?");
                amount = scan.nextInt();
                treatment(amount);
                System.out.print("How many coins of " + amount + "?");
                multiply = scan.nextInt();
                multiply2 = amount * multiply;
                System.out.print(multiply2);                
            if(multiply2 < 35)
            {
                System.out.print(35 - multiply2 + " to go");
            }
            if(multiply2 == 35 || multiply2 > 35)
            {
                System.out.print("Sure you want a Pepsi? [Y/N]");
                result = scan.next();
                if(result.equals("Y") || result.equals("y"))
                {
                    System.out.print("Here is your Coke. Thanks :D");
                }
                if(result.equals("N") || result.equals("n"))
                {
                    System.out.print("Ok. Here's your 35 cents. Bye :D");
                }
            }    
        }
        if(numProduct == 3)
        {
            System.out.println("Put 45 Cents");
                System.out.println("How much cents do you want to put it?");
                amount = scan.nextInt();
                treatment(amount);
                System.out.print("How many coins of " + amount + "?");
                multiply = scan.nextInt();
                multiply2 = amount * multiply;
                System.out.print(multiply2);
                
            if(multiply2 < 45)
            {
                System.out.print(45 - multiply2 + " to go");
            }
            if(multiply2 == 45 || multiply2 > 45)
            {
                System.out.print("Sure you want a Coke? [Y/N]");
                result = scan.next();
                if(result.equals("Y") || result.equals("y"))
                {
                    System.out.print("Here is your Coke. Thanks :D");
                }
                if(result.equals("N") || result.equals("n"))
                {
                    System.out.print("Ok. Here's your 45 cents. Bye :D");
                }
            }
        }
            
    }

    public static void treatment(int amount) {
        if (amount != 1 && amount != 5 && amount != 10 && amount != 25) {
            System.out.println("Accepts coins of 1,5,10,25 Cents");
        }
    }
}
