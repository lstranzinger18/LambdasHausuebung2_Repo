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
        //RATIONAL CALULATOR
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
        //VECTOR CALCULATOR
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
        //COMPLEX CALCULATOR
        ComplexCalculator cc = new ComplexCalculator(((Number x, Number y)
                -> {
            double x1 = x.getA() + y.getA();
            double y1 = x.getB() + y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - y.getA();
            double y1 = x.getB() - y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {
            double x1 = x.getA() * y.getA() + x.getA() * y.getB();
            double y1 = x.getB() * y.getA() + x.getB() * y.getA();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {
            double x1 = x.getA() * y.getA() + x.getB() * y.getB();
            double y1 = x.getB() * y.getA() - x.getA() * y.getB();

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
            if (ausw == 4) {
                System.exit(4910);
            }

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

            Number x = new Number();
            x.setA(xA);
            x.setB(xB);
            Number y = new Number();
            y.setA(yA);
            y.setB(yB);

            int auswCalcOper;

            System.out.print("1 − add\n"
                    + "2 − subtract\n"
                    + "3 − multiply\n"
                    + "4 − divide\n"
                    + "5 − enter numbers again");

            auswCalcOper = Integer.parseInt(sc.nextLine());

            switch (ausw) {
                case 1:
                    switch (auswCalcOper) {
                        case 1:
                            Number solAdd = rn.add.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solAdd.getA() + "\n"
                                    + "b = " + solAdd.getB() + "\n");
                            break;

                        case 2:
                            Number solSub = rn.subtract.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solSub.getA() + "\n"
                                    + "b = " + solSub.getB() + "\n");
                            break;

                        case 3:
                            Number solMul = rn.mutliply.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solMul.getA() + "\n"
                                    + "b = " + solMul.getB() + "\n");
                            break;

                        case 4:
                            Number solDiv = rn.divide.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solDiv.getA() + "\n"
                                    + "b = " + solDiv.getB() + "\n");

                            break;
                        case 5:
                            System.out.println("Enter number xA ->");
                            xA = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number xB ->");
                            xB = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number yA ->");
                            yA = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number yB ->");
                            yB = Double.parseDouble(sc.nextLine());
                            break;
                    }
                case 2:
                    switch (auswCalcOper) {
                        case 1:
                            Number solAdd = vn.add.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solAdd.getA() + "\n"
                                    + "b = " + solAdd.getB() + "\n");
                            break;

                        case 2:
                            Number solSub = vn.subtract.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solSub.getA() + "\n"
                                    + "b = " + solSub.getB() + "\n");
                            break;

                        case 3:
                            Number solMul = vn.mutliply.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solMul.getA() + "\n"
                                    + "b = " + solMul.getB() + "\n");
                            break;

                        case 4:
                            Number solDiv = vn.divide.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solDiv.getA() + "\n"
                                    + "b = " + solDiv.getB() + "\n");

                            break;
                        case 5:
                            System.out.println("Enter number xA ->");
                            xA = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number xB ->");
                            xB = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number yA ->");
                            yA = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number yB ->");
                            yB = Double.parseDouble(sc.nextLine());
                            break;

                    }
                case 3:

                    switch (auswCalcOper) {
                        case 1:
                            Number solAdd = cc.add.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solAdd.getA() + "\n"
                                    + "b = " + solAdd.getB() + "i \n");
                            break;

                        case 2:
                            Number solSub = cc.subtract.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solSub.getA() + "\n"
                                    + "b = " + solSub.getB() + " i\n");
                            break;

                        case 3:
                            Number solMul = cc.mutliply.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solMul.getA() + "\n"
                                    + "b = " + solMul.getB() + " i\n");
                            break;

                        case 4:
                            Number solDiv = cc.divide.calc(x, y);
                            System.out.print("Solution:\n"
                                    + "a = " + solDiv.getA() + "\n"
                                    + "b = " + solDiv.getB() + " i\n");

                            break;
                        case 5:
                            System.out.println("Enter number xA ->");
                            xA = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number xB ->");
                            xB = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number yA ->");
                            yA = Double.parseDouble(sc.nextLine());
                            System.out.println("Enter number yB ->");
                            yB = Double.parseDouble(sc.nextLine());
                            break;

                    }

            }
        }

    }

}
