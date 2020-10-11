/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3B.lstranzinger18.LambdasHausuebung;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class MainCalcs {

    public static void main(String[] args) {

        RationalCalculator rn = new RationalCalculator(((Number x, Number y) -> {

            double x1 = x.getA() + y.getA();
            double y1 = x.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - y.getA();
            double y1 = x.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {
            double x1 = x.getA() * x.getB();
            double y1 = y.getA() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {
            double x1 = x.getA() / x.getB();
            double y1 = y.getA() / y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }));

        VectorCalculator vn = new VectorCalculator(((Number x, Number y) -> {

            double x1 = x.getA() + y.getA();
            double y1 = y.getB() + x.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - y.getA();
            double y1 = y.getB() - x.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {
            double x1 = x.getA() * x.getB();
            double y1 = y.getA() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {
            double x1 = x.getA() / x.getB();
            double y1 = y.getA() / y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }));
        MainCalcs mc = new MainCalcs();
       
        
        
        
        
         Scanner sc = new Scanner(System.in);
        int ausw = 0;

        while (ausw != 4) {
            System.out.println("CHOOSE CALCULATOR");
            System.out.print("1 − Relationalcalculator\n"
                    + "2 − Vector calculator\n"
                    + "3 − Complex calculator\n"
                    + "4 − Exit program");

            System.out.println("Auswahl:");

            ausw = Integer.parseInt(sc.nextLine());
            if(ausw == 4)
            {System.exit(4910);}
            double xA;
            double xB;
            double yA;
            double yB;

            System.out.println("Enter number xA ->");
            xA = Double.parseDouble(sc.nextLine());
            System.out.println("Enter number xB ->");
            xB = Double.parseDouble(sc.nextLine());
            System.out.println("Enter number yA ->");
            yA = Double.parseDouble(sc.nextLine());
            System.out.println("Enter number yB ->");
            yB = Double.parseDouble(sc.nextLine());

            int auswCalcOper;
            

            System.out.print("1 − add\n"
                    + "2 − s u b t r a c t\n"
                    + "3 − m ul ti pl y\n"
                    + "4 − di vi d e\n"
                    + "5 − e n t e r numbers again");

            auswCalcOper = Integer.parseInt(sc.nextLine());
            
            
            switch(ausw)
            {
                case 1:
                    switch(auswCalcOper)
                        
                    {
                        case 1:
                            
                            
                        
                        
                    }}
                    
                    
                    
            
            
            }
            
            
            
            
    }

   
}
