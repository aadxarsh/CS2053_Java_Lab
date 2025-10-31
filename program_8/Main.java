import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using wrapper classes with autoboxing
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();

        intList.add(10);       // autoboxing: int → Integer
        doubleList.add(3.14);  // autoboxing: double → Double
        charList.add('A');     // autoboxing: char → Character

        // Using generic Box class
        Box<Integer> intBox = new Box<>(intList.get(0));
        Box<Double> doubleBox = new Box<>(doubleList.get(0));
        Box<Character> charBox = new Box<>(charList.get(0));

        intBox.display();
        doubleBox.display();
        charBox.display();
    }
}
