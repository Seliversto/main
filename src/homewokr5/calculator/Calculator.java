package homewokr5.calculator;

public class Calculator {
    Logger logger;
    public  Calculator(Logger logger) {this.logger = logger;}

    // Операция Умножение
    public double multiplication(double number1, double number2) {
        double value = number1 * number2;
        logger.log(number1 + " * " + number2 + " = " + value);
        return value;
    }

    // Операция Сложение
    public  double sum(double number1, double number2) {
        double value = number1 + number2;
        logger.log(number1 + " + " + number2 + " = " + value);
        return value;
    }

    // Операция Деление
    public  double division(double number1, double number2) {
        double value = number1 / number2;
        logger.log(number1 + " / " + number2 + " = " + value);
        return value;
    }

    // Операция Вычитание
    public  double subtraction(double number1, double number2) {
        double value = number1 - number2;
        logger.log(number1 + " - " + number2 + " = " + value);
        return value;
    }
}
