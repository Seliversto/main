package homework3;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat first = new Cat();
        first.sleep("Кошка");
    }

    @Override
    public void eat(String animal) {
    }

    @Override
    public void makeNoise(String animal) {
    }
    public String mew;
}
