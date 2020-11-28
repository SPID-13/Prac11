package QueueTask3;

import java.util.Scanner;

public class Test {
    public static void evaluate() {
        try {
            Scanner sc = new Scanner(System.in);
            double x = sc.nextDouble();

            BinaryOperation function = new Add(
                    new Subtract(
                            new Multiply(
                                    new Variable("x"),
                                    new Variable("x")
                            ),
                            new Multiply(
                                    new Const(2),
                                    new Variable("x")
                            )
                    ),
                    new Const(1)
            );

            System.out.println(function.evaluate(x));

        } catch (Exception exception) {
            System.out.print("\nНекоррректный ввод.");
            evaluate();
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите х: ");
        evaluate();
    }
}
