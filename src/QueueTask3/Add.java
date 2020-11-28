package QueueTask3;

public class Add extends BinaryOperation {

    public Add(Calculating f, Calculating s) {
        super(f, s);
    }

    @Override
    protected double evaluate(double l, double r) { return l + r; }

}