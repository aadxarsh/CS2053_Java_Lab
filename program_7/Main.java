public class Main {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        UserThread user1 = new UserThread(sharedPrinter, "User1", 3);
        UserThread user2 = new UserThread(sharedPrinter, "User2", 4);

        user1.start();
        user2.start();
    }
}
