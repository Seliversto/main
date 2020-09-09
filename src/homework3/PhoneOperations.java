package homework3;

public class PhoneOperations {
    public static void main(String[] args) {
        Phone first = new Phone();
        Phone second = new Phone();
        Phone third = new Phone();
        System.out.println(first.number + " " + first.model + " " + first.weight);
        System.out.println(second.number + " " + second.model + " " + second.weight);
        System.out.println(third.number + " " + third.model + " " + third.weight);

        first.receiveCall("Михаил");
        second.receiveCall("Палыч");
        third.receiveCall("Терентьев");
        first.getNumber();
        second.getNumber();
        third.getNumber();

        Phone fourth = new Phone("Привет", "Ну привет", "Как дела");
        System.out.println(fourth.number + " " + fourth.model + " " + fourth.weight);

        Phone five = new Phone();
        five.receiveCall("Алексей", "9179");
        five.sendMessage("1", "2", "3");
    }
}
