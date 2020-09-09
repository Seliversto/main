package homework3;

public class Horse extends Animal {
    public static void main(String[] args) {
        Horse first = new Horse();
        first.sleep("Лошадь");
    }

    @Override
    public void eat(String animal) {
    }

    @Override
    public void makeNoise(String animal) {
    }
    public String nooooo;
}