package QueueTask4;

public class Variable implements TripleExpression {
    private String variable;

    public Variable(String var) { this.variable = var;   }

    public int evaluate(int x, int y, int z) {
        if (variable.equals("x")) {
            return x;
        } else if (variable.equals("y")) {
            return y;
        } else {
            return z;
        }
    }
}
