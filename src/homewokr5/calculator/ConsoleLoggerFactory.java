package homewokr5.calculator;

public class ConsoleLoggerFactory implements  LoggerFactory {

    @Override
    public Logger getLogger() {return  new ConsoleLogger();}
}
