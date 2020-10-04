/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3B.lstranzinger18.LambdasHausuebung;

import java.io.IOException;

/**
 *
 * @author lukas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        NumberTester ntester = new NumberTester("C:\\Users\\lukas\\Desktop\\NetbeansProjets\\Hausuebung2Lambdas\\src\\net\\htlgrieskirchen\\pos3B\\lstranzinger18\\LambdasHausuebung\\ToBeTested.txt");
        ntester.setOddEvenTester(x -> {

            boolean result = false;

            if (x % 2 == 0) {
                result = true;
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }

            return result;
        });
        ntester.setPrimeTester(x
                -> {
            boolean result = false;
            
            if(x == 1)
            {
            result = true;
                
            }
            else
            {
            for (int i = 2; i <= x/2; i++) {
                if(x % i == 0)
                {
                
                result = true;
                break;
                }
                    
                
            }
            }
            
            
            
            if (result == true) {
                System.out.println("NO PRIME");
            } else if (result == false) {
                System.out.println("PRIME");
            }
            return !result;

        });

        ntester.setPalindrom(x -> {

            boolean result = false;
            int temp = 0;
            int originalInt = 0;
            int reversedInt = 0;

            originalInt = x;

            while (x != 0) {
                temp = x % 10;
                reversedInt = reversedInt * 10 + temp;
                x = x / 10;

            }

            if (originalInt == reversedInt) {
                result = true;
                System.out.println("PALINDROME");
            } else {
                result = false;
                System.out.println("NO PALINDROME");
            }
            return result;
        });
        ntester.testFile();
    }

}
