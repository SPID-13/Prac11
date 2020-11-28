package QueueTask3;

public class Multiply extends BinaryOperation {

    public Multiply(Calculating f, Calculating s) {
        super(f, s);
    }

    @Override
    protected double evaluate(double l, double r) {
        return l*r;
    }

}
