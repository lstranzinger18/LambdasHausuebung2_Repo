/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3B.lstranzinger18.LambdasHausuebung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class NumberTester {

    public interface NumberTest {

        boolean testNumber(int number);

    }
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    public String fileName;

    public NumberTester(String fileName) {

        this.fileName = fileName;

    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;

    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;

    }

    public void setPalindrom(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;

    }

    public void testFile() throws FileNotFoundException {
        int anzahlTestFälle;

        File file = new File(this.fileName);
        System.out.println(file.exists());

        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {

        }
        anzahlTestFälle = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < anzahlTestFälle; i++) {

            String[] numbersPerLine = (scan.nextLine().split(" "));

            if (numbersPerLine.length > 1) {
                int chooseTest = Integer.parseInt(numbersPerLine[0]);
                int toTest = Integer.parseInt(numbersPerLine[1]);

                if(chooseTest != 0 && chooseTest < 4)
                {
                switch (chooseTest) {

                    case 1:
                        oddTester.testNumber(toTest);
                        break;

                    case 2:
                        primeTester.testNumber(toTest);
                        break;
                    case 3:
                        palindromeTester.testNumber(toTest);
                        break;

                }
                }
                else{
                
                    System.out.println("ES GIBT KEINEN ZU DURCHFÜHRENDEN TEST MIT DIESEM INDEX");
                }
            }

        }

        scan.close();

    }

}
