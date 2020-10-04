/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3B.lstranzinger18.LambdasHausuebung;

import net.htlgrieskirchen.pos3B.lstranzinger18.LambdasHausuebung.Number.CalculationOperation;

/**
 *
 * @author lukas
 */
public abstract class AbstractCalculator {

    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation mutliply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation mutliply, CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.mutliply = mutliply;
        this.divide = divide;

    }

    public abstract Number add(Number a, Number b);

    public abstract Number subtract(Number a, Number b);

    public abstract Number multiply(Number a, Number b);

    public abstract Number divide(Number a, Number b);
}
