package QueueTask3;

public class Subtract extends BinaryOperation {

    public Subtract(Calculating f, Calculating s) {
        super(f, s);
    }

    @Override
    protected double evaluate(double l, double r) {
        return l * r;
    }

}
