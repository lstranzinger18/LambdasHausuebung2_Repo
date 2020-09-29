/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3B.lstranzinger18.LambdasHausuebung;

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
    String fileName;
    public NumberTester(String fileName) {
        
        this.fileName = fileName;
        
        
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
        this.oddTester = 

    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;

    }
     public void setPalindrom(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;

    }

    public void testFile() {

        
        
    }

}
