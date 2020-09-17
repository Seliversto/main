package homewokr5.calculator;

public class Main {
    public static void main(String[] args) {
        Logger dbLogger = new DbLoggerFactory().getLogger();
        Logger consoleLogger = new ConsoleLoggerFactory().getLogger();
        Logger fileLogger = new FileLoggerFactory().getLogger();

        double multCalculator = new Calculator(dbLogger).multiplication(246.21, 647.13);
        double sumCalculator = new Calculator(consoleLogger).sum(864.23, 59.32);
        double divisionCalculator = new Calculator(fileLogger).division(975.19, 573.55);
        double subCalculator = new Calculator(fileLogger).subtraction(328.43, 865.31);

    }
}
