package QueueTask4;

public class Add extends ExpressionParser {

    public Add(TripleExpression f, TripleExpression s) { super(f, s); }

    @Override
    protected int evaluate(int f, int s) throws Exception {
        if(s > 0 ? f > Integer.MAX_VALUE - s : f < Integer.MIN_VALUE - s) { throw new OverflowException(); }
        return f + s;
    }

}