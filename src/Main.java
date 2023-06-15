public class Main {
    public static void main(String[] args) {
        calculator calculator = new calculator();


        double num1 = 10.045;
        double num2 = 0;

        double sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum);

        double difference = calculator.subtract(num1, num2);
        System.out.println("Difference: " + difference);

        double product = calculator.multiply(num1, num2);
        System.out.println("Product: " + product);
        try {
            double quotient = calculator.divide(num1, num2);
            System.out.println("Quotient: " + quotient);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
