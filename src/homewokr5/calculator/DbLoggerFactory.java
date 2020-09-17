package homewokr5.calculator;

public class DbLoggerFactory implements LoggerFactory {

    @Override
    public Logger getLogger() {return new DbLogger();}
}
