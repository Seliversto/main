package homewokr5.computer.strategies;

import  homewokr5.computer.Computer;
import  homewokr5.computer.factories.AmdFactory;

public class GamingComputerStrategy extends ComputerStrategy{
    public GamingComputerStrategy(AmdFactory cpuFactory) {
        super(cpuFactory);
    }
}
