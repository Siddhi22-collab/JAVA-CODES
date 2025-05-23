interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operation(10, 5));
    }
}
