package QueueTask3;

public class Divide extends BinaryOperation {

    public Divide(Calculating f, Calculating s) {
        super(f, s);
    }

    @Override
    protected double evaluate(double l, double r) {
        return l/r;
    }

}