package homework3;

public class Dog extends Animal {
    public static void main(String[] args) {
        Dog first = new Dog();
        first.sleep("Собака");
    }

    @Override
    public void eat(String animal) {
    }

    @Override
    public void makeNoise(String animal) {
    }
    public String howl;
}

