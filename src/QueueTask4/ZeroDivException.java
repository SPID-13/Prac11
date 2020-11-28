package QueueTask4;

public class ZeroDivException extends Exception {
    public ZeroDivException() {
        super("Делить на ноль нельзя!");
    }
}