package QueueTask3;

public abstract class BinaryOperation implements Calculating {

    final Calculating first;
    final Calculating second;

    public BinaryOperation (Calculating first, Calculating second) {
        this.first = first;
        this.second = second;
    }

    public double evaluate(double variable) {
        if (first instanceof Const) {
            if (second instanceof Const) {
                return evaluate(((Const) first).constant, ((Const) second).constant);
            }
            if (second instanceof Variable) {
                return evaluate(((Const) first).constant, variable);
            }
            if (second instanceof BinaryOperation) {
                return evaluate(((Const) first).constant, ((BinaryOperation) second).evaluate(variable));
            }
        }
        if (first instanceof Variable) {
            if (second instanceof Const) {
                return evaluate(variable, ((Const) second).constant);
            }
            if (second instanceof Variable) {
                return evaluate(variable, variable);
            }
            if (second instanceof BinaryOperation) {
                return evaluate(variable, ((BinaryOperation) second).evaluate(variable));
            }
        }
        if (first instanceof BinaryOperation) {
            if (second instanceof Const) {
                return evaluate(((BinaryOperation) first).evaluate(variable), ((Const) second).constant);
            }
            if (second instanceof Variable) {
                return evaluate(((BinaryOperation) first).evaluate(variable), variable);
            }
            if (second instanceof BinaryOperation) {
                return evaluate(((BinaryOperation) first).evaluate(variable), ((BinaryOperation) second).evaluate(variable));
            }
        }
        return 0;
    }

    protected abstract double evaluate(double l, double r);
}
