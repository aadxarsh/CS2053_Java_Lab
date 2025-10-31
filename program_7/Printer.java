public class Printer {
    public synchronized void print(String user, int pages) {
        for (int i = 1; i <= pages; i++) {
            System.out.println(user + " is printing page " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}
