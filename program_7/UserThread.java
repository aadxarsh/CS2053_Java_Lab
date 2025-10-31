public class UserThread extends Thread {
    private Printer printer;
    private String user;
    private int pages;

    public UserThread(Printer printer, String user, int pages) {
        this.printer = printer;
        this.user = user;
        this.pages = pages;
    }

    public void run() {
        printer.print(user, pages);
    }
}
