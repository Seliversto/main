package homewokr5.computer.strategies;

import  homewokr5.computer.Computer;
import  homewokr5.computer.factories.CpuFactory;

public abstract class ComputerStrategy {
    protected CpuFactory cpuFactory;

    private void  chooseCpu(Computer computer) {
        computer.cpu = cpuFactory.getCpu();
    }

    public ComputerStrategy(CpuFactory cpuFactory) {
        this.cpuFactory = cpuFactory;
    }

    public void buildComputer(Computer computer) {
        chooseCpu(computer);
    }
}
