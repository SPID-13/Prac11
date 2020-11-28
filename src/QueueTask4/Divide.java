package QueueTask4;

public class Divide extends ExpressionParser {

    public Divide(TripleExpression f, TripleExpression s) { super(f, s); }

    @Override
    protected int evaluate(int f, int s) throws Exception {
        if((f == Integer.MIN_VALUE) && (s == -1))  { throw new OverflowException(); }
        if(s == 0) { throw new ZeroDivException(); }
        return f / s;
    }

}