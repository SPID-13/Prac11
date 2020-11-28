package QueueTask4;

public class Subtract extends ExpressionParser {

    public Subtract(TripleExpression f, TripleExpression s) { super(f, s); }

    @Override
    protected int evaluate(int f, int s) throws Exception {
        if(s > 0 ? f < Integer.MIN_VALUE + s : f > Integer.MAX_VALUE + s)
            throw new OverflowException();
        return f - s;
    }

}
