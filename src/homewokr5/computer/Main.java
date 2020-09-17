package homewokr5.computer;

import homewokr5.computer.factories.AmdFactory;
import homewokr5.computer.factories.CpuFactory;
import homewokr5.computer.strategies.ComputerStrategy;
import homewokr5.computer.strategies.GamingComputerStrategy;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        AmdFactory cpuFactory = new AmdFactory();
        ComputerStrategy gamingComputerStrategy = new GamingComputerStrategy(cpuFactory);
        gamingComputerStrategy.buildComputer(computer);
    }
}