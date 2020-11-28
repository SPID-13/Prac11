package QueueTask4;

public class Multiply extends ExpressionParser {

    public Multiply(TripleExpression f, TripleExpression s) { super(f, s); }

    @Override
    protected int evaluate(int f, int s) throws Exception {
        if(s > 0 ? f > Integer.MAX_VALUE / s || f < Integer.MIN_VALUE / s : (s < -1 ? f >Integer.MIN_VALUE / s || f < Integer.MAX_VALUE / s : s == -1 && f == Integer.MIN_VALUE))
            throw new OverflowException();
        return f * s;
    }

}
