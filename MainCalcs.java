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
public class MainCalcs {

    public static void main(String[] args) {

        RationalCalculator rn = new RationalCalculator(((Number x, Number y) -> {

            double x1 = x.getA() + x.getB();
            double y1 = y.getA() + y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - x.getB();
            double y1 = y.getA() - y.getB();

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

    }

}
