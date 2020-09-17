package homewokr5.computer.factories;

import  homewokr5.computer.Cpu;

public class  AmdFactory implements  CpuFactory {

    @Override
    public Cpu getCpu() {
        return new Cpu("AMD");
    }
}