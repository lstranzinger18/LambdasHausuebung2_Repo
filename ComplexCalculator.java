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
public class ComplexCalculator extends AbstractCalculator{

    public ComplexCalculator(Number.CalculationOperation add, Number.CalculationOperation subtract, Number.CalculationOperation mutliply, Number.CalculationOperation divide) {
        super(add, subtract, mutliply, divide);
    }

      @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
           return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
       return mutliply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }
    
}
